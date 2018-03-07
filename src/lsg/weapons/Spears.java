
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
	public Spears( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Spears(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
