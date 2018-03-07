
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Mass extends Weapons {
	/**
	 * default @constructor
	 */
	public Mass() {
		name = "Basic Mass";
		minDamage = 10;
		maxDamage = 20;
		stamCost = 5;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Mass(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	
	/**
	 * @constructor
	 */
	public Mass(int stamCost, int durability, int maxDurability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	
	/**
	 * @constructor
	 */
	public Mass(String name, int stamCost, int durability, int maxDurability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	/**
	 * @constructor
	 */
	public Mass( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
	/**
	 * @constructor
	 */
	public Mass(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
}
