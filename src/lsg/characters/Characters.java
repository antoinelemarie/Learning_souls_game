package lsg.characters;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;

public class Characters {
	
	protected String name = null;
	protected int life;
	protected double stamina;
	protected Integer maxStamina;
	protected Integer maxLife;
	protected Integer minAttack;
	protected Integer maxAttack;
	public int money;
	public static Dice precision;
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

	protected Integer getMaxLife() {
		return maxLife;
	}

	protected void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getLife() {
		return life;
	}

	protected void setLife(int life) {
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
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20s money = %-20d (Alive)\n", this.getName(),this.getLife(),this.getStamina(),this.getMoney());
		}
		if(isAlive() == false) {
			var = String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20s money = %-20d (Dead)\n", this.getName(),this.getLife(),this.getStamina(),this.getMoney());
		}
		return var;
	}
	
	

	public String printStats() {
		return this.toString();
		
	}
	
	
	/*
	 * methode d'attaque avec une arme
	 */
	public double Attackwith(Weapons arme) {
		precision = new Dice(101);
		double rand;
		double currentStamina = this.getStamina();
		double attack = (arme.getMaxDamage()-arme.getMinDamage());
		
		
		/*
		 * Calcule de la durabilité de l'arme
		 */
		if(arme.isBroken()) {
			attack = 0;
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			
			System.out.println("Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
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
			
			System.out.println("Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
			return attack;
			
		}else if(arme.getStamCost() > currentStamina) {
			
			attack = attack + arme.getMinDamage();
			attack = attack*(currentStamina/arme.getStamCost());
			attack = Math.round(attack);
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			
			System.out.println("Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			
			return attack;
		}
		
		attack = Math.round(attack);
		attack = attack + arme.getMinDamage();
		this.setStamina(currentStamina-arme.getStamCost());
		arme.use();
		System.out.println("Attaque avec ["+arme.printStats()/*.getClass().getSimpleName()*/+"] dommages causés => "+ attack);
		
		return attack;
		
	}
	
	public void Attack(Weapons character1Weapons, Characters character2) {
		double character1Attack;
		int character2Life = character2.getLife();
		
		character1Attack = this.Attackwith(character1Weapons);
		
		character2.setLife((int) (character2Life - character1Attack));

	}
	
}
