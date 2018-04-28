/**
 * 
 */
package lsg.equipements;

import lsg.bags.Collectibles;

/**
 * @author antoinelemarie
 *
 */
public class Armors extends Equipements implements Collectibles{

	/**
	 * default constructor
	 */
	public Armors() {
		super();
		name = "wooden armor";
		armorValue = 5;
		durability = 10;
		maxDurability = 10;
		
	}
	
	public Armors(String name, float armorValue) {
		this();
		this.name = name;
		this.armorValue = armorValue;
	}
	
	public Armors(String name, float armorValue, int maxDurability) {
		this();
		this.name = name;
		this.armorValue = armorValue;
		this.maxDurability = maxDurability;
	}
	
	public Armors(String name, float armorValue, int durability, int maxDurability) {
		this();
		this.name = name;
		this.armorValue = armorValue;
		this.durability = durability;
		this.maxDurability = maxDurability;
	}

	@Override
	public int getWeight() {
		return 4;//kg
	}

}
