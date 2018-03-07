
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Swords extends Weapons {
	/**
	 * default @constructor
	 */
	public Swords() {
		name = "Basic Sword";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 2;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Swords(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Swords( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Swords(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
