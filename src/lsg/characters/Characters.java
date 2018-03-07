package lsg.characters;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;

public class Characters {
	
	protected String name = null;
	protected int life;
	protected int stamina;
	protected Integer maxStamina;
	protected Integer maxLife;
	public static int money;
	public static Dice precision;
	/**
	 * @author antoinelemarie
	 * 
	 * Class Characters permet d'initialiser n'importe quel type de personnage.
	 * 
	 * @return
	 * 
	 */
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
	}
	
	protected int getStamina() {
		return stamina;
	}

	protected void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
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
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20d money = %-20s (Alive)\n", name,life,stamina,money);
		}
		if(isAlive() == false) {
			var = String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20s stamina = %-20s money = %-20s (Dead)\n", name,life,stamina,money);
		}
		return var;
	}
	
	public String printStats() {
		return this.toString();
		
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
	
	
	public double Attackwith(Weapons arme) {
		precision = new Dice(101);
		double rand;
		int currentStamina = this.getStamina();
		double attack = (arme.getMaxDamage()-arme.getMinDamage());
		
		if(arme.isBroken()) {
			rand = 0;
		}else if(arme.getDurability() <  (arme.getMaxDurability()/2)) {
			rand = this.precision.roll()/2;
		}else{
			rand=this.precision.roll();
		}
		
		if(currentStamina < 1) {
			attack = 0;
			System.out.println("Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
			arme.use();
			this.setStamina(currentStamina-arme.getStamCost());
			return attack;
		}else if(arme.getStamCost() > currentStamina) {
			attack = attack*(currentStamina/arme.getStamCost());
		}
		
		attack = attack *(rand);
		attack = attack/100;
		attack = Math.round(attack);
		attack = attack + arme.getMinDamage();
		this.setStamina(currentStamina-arme.getStamCost());
		
		arme.use();
		System.out.println("Attaque avec "+arme.printStats()+" dommages causés => "+ attack);
		
		
		
		
		return attack;
		
	}
	
}
