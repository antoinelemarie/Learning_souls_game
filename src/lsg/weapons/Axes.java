
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Axes extends Weapons {
	/**
	 * default @constructor
	 */
	public Axes() {
		name = "Basic Axe";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 1;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Axes(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Axes( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Axes(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
