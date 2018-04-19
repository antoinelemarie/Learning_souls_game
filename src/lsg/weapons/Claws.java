/**
 * 
 */
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Claws extends Weapons {

	/**
	 * 
	 */
	public Claws() {
		super();
		
			name = "claw";
			minDamage = 10;
			maxDamage = 30;
			stamCost = 2;
			durability = 100;
			maxDurability = 100;
	
	}

	/**
	 * @constructor
	 */
	public Claws(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	
	/**
	 * @constructor
	 */
	public Claws(int minDamage, int maxDamage) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
	}
	
	
	/**
	 * @constructor
	 */
	public Claws(int stamCost, int durability, int maxDurability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	
	/**
	 * @constructor
	 */
	public Claws(String name, int stamCost, int durability, int maxDurability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	/**
	 * @constructor
	 */
	public Claws( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
	/**
	 * @constructor
	 */
	public Claws(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
}
