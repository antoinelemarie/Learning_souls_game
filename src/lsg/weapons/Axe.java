
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Axe extends Weapon {
	/**
	 * default @constructor
	 */
	public Axe() {
		name = "Basic Axe";
		minDamage = 5;
		maxDamage = 10;
		stamCost = 1;
		durability = 100;
	}
	/**
	 * @constructor
	 */
	public Axe(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Axe( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	/**
	 * @constructor
	 */
	public Axe(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
}
