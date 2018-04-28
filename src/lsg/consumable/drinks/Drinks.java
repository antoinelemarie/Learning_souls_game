/**
 * 
 */
package lsg.consumable.drinks;

import lsg.bags.Collectibles;
import lsg.consumable.Consumables;

/**
 * @author antoinelemarie
 *
 */
public class Drinks extends Consumables implements Collectibles{

	/**
	 * 
	 */
	public Drinks() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Drinks(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
