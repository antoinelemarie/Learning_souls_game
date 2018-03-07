
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Spear extends Weapon {
	/**
	 * default @constructor
	 */
	public Spear() {
		name = "Basic Spear";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 3;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Spear(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Spear( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Spear(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
