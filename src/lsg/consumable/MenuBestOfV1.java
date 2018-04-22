/**
 * 
 */
package lsg.consumable;

import lsg.consumable.drinks.Coffe;
import lsg.consumable.drinks.Whisky;
import lsg.consumable.drinks.Wine;
import lsg.consumable.foods.Americains;
import lsg.consumable.foods.Hamburgers;

/**
 * @author antoinelemarie
 *
 */
public class MenuBestOfV1 extends Consumables {

	/**
	 * 
	 */
	public MenuBestOfV1() {
		// TODO Auto-generated constructor stub
		Consumables[] menu = {new Coffe(), new Whisky(), new Wine(), new Hamburgers(), new Americains()};
	}

}
