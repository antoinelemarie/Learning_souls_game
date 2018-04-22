/**
 * 
 */
package lsg.consumable.foods;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Hamburgers extends Foods {

	/**
	 * 
	 */
	public Hamburgers() {
		// TODO Auto-generated constructor stub
		String name = "Un putain de Big Mac sa mere";
		int capacity = 40;
		String stat = Characters.LIFE_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Hamburgers(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
