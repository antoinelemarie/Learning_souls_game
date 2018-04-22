/**
 * 
 */
package lsg.consumable.drinks;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Coffe extends Drinks {

	/**
	 * 
	 */
	public Coffe() {
		// TODO Auto-generated constructor stub
		String name = "Nespresso";
		int capacity = 10;
		String stat = Characters.STAMINA_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Coffe(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
