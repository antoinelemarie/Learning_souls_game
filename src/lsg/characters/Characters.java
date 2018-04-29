package lsg.characters;

import java.util.Locale;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;
import lsg.bags.Bags;
import lsg.bags.Collectibles;
import lsg.bags.SmallBags;
import lsg.buffs.*;
import lsg.consumable.Consumables;
import lsg.consumable.MenuBestOfV4;
import lsg.consumable.repairs.RepairKits;
import lsg.consumable.drinks.*;
import lsg.consumable.foods.*;

public abstract class Characters {
	
	public final static String LIFE_STATE_STRING 	= "life";
	public final static String STAMINA_STATE_STRING 	= "stamina";
	protected String name = null;
	protected int life;
	protected double stamina;
	protected Integer maxStamina;
	protected Integer maxLife;
	protected Integer minAttack;
	protected Integer maxAttack;
	protected int money;
	public static Dice precision;
	public Weapons arme;
	public Bags Cbag;
	/**
	 * @author antoinelemarie
	 * 
	 * Class Characters permet d'initialiser n'importe quel type de personnage.
	 * 
	 * @return
	 * 
	 */
	
	protected Integer getMinAttack() {
		return minAttack;
	}

	protected void setMinAttack(Integer minAttack) {
		this.minAttack = minAttack;
	}

	protected Integer getMaxAttack() {
		return maxAttack;
	}

	protected void setMaxAttack(Integer maxAttack) {
		this.maxAttack = maxAttack;
	}

	protected static Dice getPrecision() {
		return precision;
	}

	protected static void setPrecision(Dice precision) {
		Characters.precision = precision;
	}

	protected int getMoney() {
		return money;
	}

	protected void setMoney(int money) {
		this.money = money;
	}
	protected Integer getMaxStamina() {
		return maxStamina;
	}

	protected void setMaxStamina(Integer maxStamina) {
		this.maxStamina = maxStamina;
	}

	public Integer getMaxLife() {
		return maxLife;
	}

	protected void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
		if(life < 0) {
			this.life = 0;
		}
	}
	
	protected double getStamina() {
		return stamina;
	}

	protected void setStamina(double stamina) {
		this.stamina = stamina;
		if(stamina < 0) {
			this.stamina = 0;
		}
	}
	public Weapons getArme() {
		return arme;
	}

	public void setArme(Weapons arme) {
		this.arme = arme;
	}

	/**
	 * default @constructor
	 */
	protected Characters() {
		name = "Random Character";
		life = 25;
		maxLife = 100;
		stamina = 25;
		maxStamina = 500;
		this.setName(name);
		Cbag = new SmallBags();
	}
	/*
	 * methode pour voir si le personnage est en vie
	 */
	
	
	
	public boolean isAlive() {
		
		boolean alive = true;
		
		if (life == 0) {
			alive = false;
		}else {
			alive = true;
		}
		return alive;
	}
	
	public void pickUp(Collectibles item) {
		
		if (item.getWeight() > this.Cbag.getCapacity() - this.Cbag.getWeight()) {
			System.out.println("Pas assez de place dans le sac");
		}
		else {
			this.Cbag.push(item);
			System.out.println(this.getName()+" picks up "+item.toString());
		}
	}
	
	public void pullOut(Collectibles item) {
		
		if(this.Cbag.contains(item)) {
			this.Cbag.pop(item);
			System.out.println(this.getName()+" pulls out "+item.toString());
		}
		
	}
	
	public void printConsumable(Consumables conso) {
		System.out.println(conso.toString());
	}
	
	public void printBag (Collectibles item) {
		System.out.println(this.Cbag.toString());
	}
	
	public int getBagCapacity(){
		return this.Cbag.getCapacity();
	}
	
	public int getBagWeight(){
		return this.Cbag.getWeight();
	}
	
	public Object[] getBagItems(){
		return this.Cbag.getItems();
	}
	
	public Bags setBag(Bags intoBag) {
		this.Cbag.transfer(this.Cbag, intoBag);
		System.out.println(this.getName()+" changes "+this.Cbag.toString()+" For "+ intoBag.toString());
		this.Cbag = intoBag;
		return this.Cbag;
	}
	
	public void equip(Weapons weapon) {
		if(this.Cbag.contains(weapon)) {
			this.Cbag.pop(weapon);
			this.setArme(weapon);
		}
		System.out.println(this.getName()+" pulls out and equip "+weapon.toString());
	}
	
	public void equip(Consumables conso) {
		if(this.Cbag.contains(conso)) {
			this.Cbag.pop(conso);
			this.use(conso);
		}
		System.out.println(this.getName()+" pulls out and equip/use "+conso.toString());
	}

	@Override
	public String toString() {
		String var = "";
		if(isAlive() == true) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20s money "
					+ "= %-20d protection = %-20f (Alive)\n", this.getName(),this.getLife(),this.getStamina(),this.getMoney(), this.computeProtection());
		}
		if(isAlive() == false) {
			var = String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20s money "
					+ "= %-20d (Dead)\n", this.getName(),this.getLife(),this.getStamina(),this.getMoney());
		}
		return var;
	}
	
	

	public String printStats() {
		return this.toString();
		
	}
	
	
	/*
	 * methode d'attaque avec une arme
	 */
	private double Attackwith(Weapons arme) {
		precision = new Dice(101);
		double rand;
		double currentStamina = this.getStamina();
		double attack = (arme.getMaxDamage()-arme.getMinDamage());
		
		
		/*
		 * Calcul de la durabilité de l'arme
		 */
		if(arme.isBroken()) {
			attack = 0;
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			
			System.out.println("**"+this.getName()+" Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
			return attack;
		}else if(arme.getDurability() <  (arme.getMaxDurability()/2)) {
			rand = this.precision.roll()/2;
		}else{
			rand=this.precision.roll();
			
		}
		
		attack = attack *(rand);
		attack = attack/100;

		
		/*
		 * Calcule de la stamina du personnage
		 */
		if(currentStamina < 1) {
			
			attack = 0;
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			
			
			System.out.println("**"+this.getName()+" Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
			return attack;
			
		}else if(arme.getStamCost() > currentStamina) {
			
			attack = attack + arme.getMinDamage();
			attack = attack*(currentStamina/arme.getStamCost());
			attack = Math.round(attack);
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			
			System.out.println("**"+this.getName()+" Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
			return attack;
		}
		
		attack = Math.round(attack);
		attack = attack + arme.getMinDamage();
		this.setStamina(currentStamina-arme.getStamCost());
		arme.use();
		
		
		System.out.println("attack avant buff : "+attack);
		attack = attack * (1 + computeBuffValue()/100); // application du buff du personnage
		System.out.println("********attack après : "+attack);
		
		
		System.out.println("**"+this.getName()+" Attaque avec "+arme.printStats()/*.getClass().getSimpleName()*/+"]");
		
		return attack;
		
	}
	
	public double Attack() {
		double characterAttack;
		
		
		if (this.isAlive()) {
			characterAttack = this.Attackwith(this.getArme());
		}else {
			characterAttack = 0;
		}
		
		
		return characterAttack;
	}
	
	public float GetHitWith(double value) {
		
		float protection = computeProtection();
		double degats =0;
		float characterLife = this.getLife();
		
		if (protection == 100) {
			degats = 0;
		}else {
			degats = value - value*(protection/100);
		}
		degats = (int) ((value >= characterLife)? characterLife : degats);
		
		degats = Math.round(degats);
		characterLife = (float) (characterLife - degats);
		this.setLife((int) characterLife);
		
		System.out.println( "dommages causés => "+ degats);
		
		return (float) degats;
	}
	
	abstract public float computeProtection();
	abstract public float computeBuffValue();
	
	private void Drink(Drinks drink) {
		double capacity = drink.use();
		if (capacity+this.getStamina() > this.getMaxStamina()) {
			capacity =this.getMaxStamina()-this.getStamina();
		}
		System.out.println(this.getName()+" drinks "+ drink.getName()+ " ["+capacity+" stamina points ]");
		if (this.getMaxStamina()<this.getStamina()+capacity) {
			this.setStamina(this.getMaxStamina());
		}else {
		this.setStamina(this.getStamina()+capacity);
		}
		
	}
	
	private void Eat(Foods food) {
		int capacity = food.use();
		if (capacity+this.getLife() > this.getMaxLife()) {
			capacity = this.getMaxLife()-this.getLife();
		}
		System.out.println(this.getName()+" eats "+ food.getName()+ " ["+capacity+" life points ]");
		if (this.getMaxLife()<this.getLife()+capacity) {
			this.setLife(this.getMaxLife());
		}else {
		this.setLife(this.getLife()+capacity);
		}
		
	}
	
	private void RepairWeaponWith(RepairKits kit) {
		arme = this.getArme();
		arme.repairWith(kit);
		System.out.println(this.getName()+ "repairs"+ arme.getName()+ arme.printStats()+ "with" + kit.toString());
	}
	
	public void use(Consumables consumable) {
		
		if (consumable instanceof Drinks) {
			Drink((Drinks) consumable);
		}else if (consumable instanceof Foods) {
			Eat((Foods) consumable);
		}else if(consumable instanceof RepairKits) {
			RepairWeaponWith((RepairKits) consumable);
		}
		
	}
	
	public Drinks fastDrink() {
		for(int i =0; i< this.Cbag.getItems().length;i++) {
			Drinks temp = (Drinks) this.Cbag.getItems()[i];
			if(temp instanceof Drinks) {
				this.use((Consumables) this.Cbag.getItems()[i]);
			}
		}
		return null;
		
	}
	
	public Foods fastEat() {
		for(int i =0; i< this.Cbag.getItems().length;i++) {
			Foods temp = (Foods) this.Cbag.getItems()[i];
			if(temp instanceof Foods) {
				this.use((Consumables) this.Cbag.getItems()[i]);
			}
		}
		return null;
		
	}
	
	public RepairKits fastRepair() {
		for(int i =0; i< this.Cbag.getItems().length;i++) {
			RepairKits temp = (RepairKits) this.Cbag.getItems()[i];
			if(temp instanceof RepairKits) {
				this.use((Consumables) this.Cbag.getItems()[i]);
			}
		}
		return null;
		
	}
	
		
	
	
	public void createExhaustedHero() {
		Heros heroEpuise = new Heros();
		Weapons grosseArme = new Weapons("Grosse Arme", 0, 0, 100000, 100);
		heroEpuise.setArme(grosseArme);
		heroEpuise.GetHitWith(99);
	}
	
	
}
