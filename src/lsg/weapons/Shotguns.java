
package lsg.weapons;

/**
 * @author antoinelemarie
 *
 */
public class Shotguns extends Weapons {
	/**
	 * default @constructor
	 */
	public Shotguns() {
		super();
		name = "Hunter's Shotgun";
		minDamage = 5;
		maxDamage = 20;
		stamCost = 5;
		durability = 50;
	}
	/**
	 * @constructor
	 */
	public Shotguns(String name, int durability) {
		this();
		this.name = name;
		this.durability = durability;
	}
	
	/**
	 * @constructor
	 */
	public Shotguns(int stamCost, int durability, int maxDurability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	
	/**
	 * @constructor
	 */
	public Shotguns(String name, int stamCost, int durability, int maxDurability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}
	/**
	 * @constructor
	 */
	public Shotguns( int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
	/**
	 * @constructor
	 */
	public Shotguns(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this();
		this.name = name;
		this.stamCost = stamCost;
		this.durability = durability;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
	}
}
