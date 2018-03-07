
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Sword extends Weapon {
	/**
	 * default @constructor
	 */
	public Sword() {
		name = "Basic Sword";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 2;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Sword(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Sword( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Sword(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
