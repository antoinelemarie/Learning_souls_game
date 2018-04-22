/**
 * 
 */
package lsg.consumable.drinks;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Wine extends Drinks {

	/**
	 * 
	 */
	public Wine() {
		// TODO Auto-generated constructor stub
		String name = "Pente douce blanc, Chateau Lacoste";
		int capacity = 30;
		String stat = Characters.STAMINA_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Wine(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
