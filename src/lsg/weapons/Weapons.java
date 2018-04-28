package lsg.weapons;

import lsg.bags.Collectibles;

public class Weapons implements Collectibles{
	public final static String DURABILITY_STATE_STRING = "durability";
	protected String name;
	protected int minDamage;
	protected int maxDamage;
	protected int stamCost;
	protected int durability;
	protected int maxDurability;
	


	/**
	 * Getters & Setter
	 * @param durability
	 */
	
	public int getMaxDurability() {
		return maxDurability;
	}


	protected void setMaxDurability(int maxDurability) {
		this.maxDurability = maxDurability;
	}
	public String getName() {
		return name;
	}

	public int getMinDamage() {
		return minDamage;
	}
	
	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getMaxDamage() {
		return maxDamage;
	}
	
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getStamCost() {
		return stamCost;
	}
	
	public void setStamCost(int stamCost) {
		this.stamCost = stamCost;
	}

	public int getDurability() {
		return durability;
	}
	
	private void setDurability(int durability) {
		this.durability = durability;
		if(durability < 0) {
			this.durability = 0;
		}
	}

	/**
	 * default @constructor
	 */
	public Weapons() {
		name = "Wooden branch";
		minDamage = 1;
		maxDamage = 5;
		stamCost = 2;
		durability = 3;
		maxDurability = 50;
	}
	
	/**
	 * default @constructor
	 */
	public Weapons(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	
	/**
	 * @constructor
	 */
	public Weapons(int stamCost, int durability, int maxDurability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	
	/**
	 * @constructor
	 */
	public Weapons(String name, int stamCost, int durability, int maxDurability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
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
	
	/*
	 * Methode -1 en durabilite
	 */
	public void use(){
		this.setDurability(this.durability-1);
	}
	
	/*
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
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s dégats = %d-%-16d stamina cost = %-15d durability = %-20d max durability = %-20d (usable)\n", this.getName(),this.getMinDamage(),this.getMaxDamage(),this.getStamCost(),this.getDurability(), this.getMaxDurability() );
		}
		if(isBroken() == true) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s dégats = %d-%-16d stamina cost = %-15d durability = %-20d max durability = %-20d (broken)\n", this.getName(),this.getMinDamage(),this.getMaxDamage(),this.getStamCost(),this.getDurability(), this.getMaxDurability() );
		}
		return var;
	}
	
	public String printStats() {
		return this.toString();
		
	}


	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 2;//kg
	}
}
