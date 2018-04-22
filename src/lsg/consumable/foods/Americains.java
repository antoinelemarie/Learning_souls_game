/**
 * 
 */
package lsg.consumable.foods;

import lsg.characters.Characters;

/**
 * @author antoinelemarie
 *
 */
public class Americains extends Foods {

	/**
	 * 
	 */
	public Americains() {
		// TODO Auto-generated constructor stub
		String name = "LA pizza royale de 20kg";
		int capacity = 3000;
		String stat = Characters.LIFE_STATE_STRING;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	/**
	 * @param name
	 * @param capacity
	 * @param stat
	 */
	public Americains(String name, int capacity, String stat) {
		super(name, capacity, stat);
		// TODO Auto-generated constructor stub
	}

}
