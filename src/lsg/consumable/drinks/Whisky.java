/**
 * 
 */
package lsg.consumable.drinks;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Whisky extends Drinks {

	/**
	 * 
	 */
	public Whisky() {
		// TODO Auto-generated constructor stub
		String name = "Akashi whisky meisei blended";
		int capacity = 150;
		String stat = Characters.STAMINA_STATE_STRING;
	}

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Whisky(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
