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
		super();
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
