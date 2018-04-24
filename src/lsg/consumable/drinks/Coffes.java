/**
 * 
 */
package lsg.consumable.drinks;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Coffes extends Drinks {

	/**
	 * 
	 */
	public Coffes() {
		// TODO Auto-generated constructor stub
		String name = "Nespresso - Kazaar. What else ?";
		int capacity = 10;
		String stat = Characters.STAMINA_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Coffes(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
