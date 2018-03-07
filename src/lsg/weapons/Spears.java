
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Spears extends Weapons {
	/**
	 * default @constructor
	 */
	public Spears() {
		super();
		name = "Basic Spear";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 3;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Spears(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	
	/**
	 * @constructor
	 */
	public Spears(int stamCost, int durability, int maxDurability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	
	/**
	 * @constructor
	 */
	public Spears(String name, int stamCost, int durability, int maxDurability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	/**
	 * @constructor
	 */
	public Spears( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
	/**
	 * @constructor
	 */
	public Spears(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
}
