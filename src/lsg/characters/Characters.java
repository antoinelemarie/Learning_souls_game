package lsg.characters;

import java.util.Locale;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;

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
		System.out.println("**"+this.getName()+" Attaque avec "+arme.printStats()/*.getClass().getSimpleName()*/+"] dommages causés => "+ attack);
		
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
		//character2.setLife((int) (character2Life - character1Attack));

	}
	
	public float GetHitWith(int value) {
		
		float protection = computeProtection();
		float degats =0;
		float characterLife = this.getLife();
		
		if (protection == 100) {
			degats = 0;
		}else {
			degats = value*(protection/100);
		}
		degats = (int) ((value >= characterLife)? characterLife : value);
		
		degats = Math.round(degats);
		characterLife = characterLife - degats;
		this.setLife((int) characterLife);
		
		return degats;
	}
	
	abstract public float computeProtection();
	
}
