package lsg.weapons;

public class Weapon {
	protected String name;
	protected int minDamage;
	protected int maxDamage;
	protected int stamCost;
	protected int durability;
	
	/**
	 * default @constructor
	 */
	public Weapon() {
		this.name = "Generic Weapon";
	}
	/**
	 * @constructor
	 */
	public Weapon(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * M�thode -1 en durabilit�
	 */
	public void use(){
		this.setDurability(this.durability-1);
	}
	/**
	 * V�rifie si l'arme est bris�e
	 * @return boolean si l'arme a 0 ou moins en durabilit�
	 */
	public boolean isBroken() {
		if (getDurability()<1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.getName()+"(min:"+this.getMinDamage()+" max:"+this.getMaxDamage()+" Stam:"+this.getStamCost()+" dur:"+this.getDurability()+")";
	}
	
	
	/**
	 * Getters & 1 Setter
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


	


	
	
	

}
