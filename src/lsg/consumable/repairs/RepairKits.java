/**
 * 
 */
package lsg.consumable.repairs;

import lsg.bags.Collectibles;
import lsg.characters.Characters;
import lsg.consumable.Consumables;
import lsg.weapons.Weapons;

/**
 * @author antoinelemarie
 *
 */
public class RepairKits extends Consumables implements Collectibles{

	private String name;
	private int capacity;
	private String stat;

	/**
	 * 
	 */
	public RepairKits() {
		// TODO Auto-generated constructor stub
		String name = "Kit de reparage";
		int capacity = 10;
		String stat = Weapons.DURABILITY_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public RepairKits(String name, int capacity, String stat) {
		this.name = name;
		this.capacity = capacity;
		this.stat = stat;
	}
	
	
	public int use() {
		int capacity = this.getCapacity();
		this.setCapacity(capacity -1);
		
		return capacity;
		
	}
}
