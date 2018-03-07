package lsg.weapons;

public class Weapons {
	protected String name;
	protected int minDamage;
	protected int maxDamage;
	protected int stamCost;
	protected static int durability;
	/**
	 * Getters & Setter
	 * @param durability
	 */
	private void setDurability(int durability) {
		this.durability = durability;
	}


	public String getName() {
		return name;
	}


	public int getMinDamage() {
		return minDamage;
	}


	public int getMaxDamage() {
		return maxDamage;
	}


	public int getStamCost() {
		return stamCost;
	}


	public int getDurability() {
		return durability;
	}

	/**
	 * default @constructor
	 */
	public Weapons() {
		name = "Generic Weapon";
		minDamage = 1;
		maxDamage = 3;
		stamCost = 2;
		durability = 50;
	}
	/**
	 * @constructor
	 */
	public Weapons(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Weapons( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Weapons(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * Methode -1 en durabilite
	 */
	public void use(){
		this.setDurability(this.durability-1);
	}
	/**
	 * Verifie si l'arme est brisee
	 * @return boolean si l'arme a 0 ou moins en durabilite
	 */
	public boolean isBroken() {
		if (this.getDurability()<1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		String var = "";
		if(isBroken() == false) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s dégats = %d-%-16d stamina cost = %-15d durability = %-20d (usable)", this.getName(),this.getMinDamage(),this.getMaxDamage(),this.getStamCost(),this.getDurability() );
		}
		if(isBroken() == true) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s dégats = %d-%-16d stamina cost = %-15d durability = %-20d (broken)", this.getName(),this.getMinDamage(),this.getMaxDamage(),this.getStamCost(),this.getDurability() );
		}
		return var;
	}
	public String printStats() {
		return this.toString();
		
	}
}
