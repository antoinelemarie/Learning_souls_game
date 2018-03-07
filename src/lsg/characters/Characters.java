package lsg.characters;

import lsg.helpers.Dice;

public class Characters {
	
	protected String name = null;
	protected int life;
	protected int stamina;
	protected Integer maxStamina;
	protected Integer maxLife;
	public static int money;
	public Dice precision = new Dice(101);
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
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20d stamina = %-20d money = %-20s (Alive)", name,life,stamina,money);
		}
		if(isAlive() == false) {
			var = String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s life = %-20s stamina = %-20s money = %-20s (Dead)", name,life,stamina,money);
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
	
}
