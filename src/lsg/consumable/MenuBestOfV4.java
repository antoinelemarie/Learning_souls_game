/**
 * 
 */
package lsg.consumable;

import java.util.HashSet;
import java.util.LinkedHashSet;

import lsg.consumable.drinks.*;
import lsg.consumable.foods.*;

/**
 * @author antoinelemarie
 *
 */

	public class MenuBestOfV4 extends LinkedHashSet<Consumables> {


	    private LinkedHashSet<Consumables> menu = new LinkedHashSet<Consumables>();

	    /**
		 * @param menu the menu to set
		 */
		public void setMenu(LinkedHashSet<Consumables> menu) {
			this.menu = menu;
		}

		public MenuBestOfV4() {

	        this.menu.add(new Hamburgers());
	        this.menu.add(new Wines());
	        this.menu.add(new Americains());
	        this.menu.add(new Coffes());
	        this.menu.add(new Whiskys());

	    }

	    public String toString() {

	        String display = "";
	        int index = 1;

	        for (Consumables consumable : menu) {
	            display += index + ": " + consumable.toString() + "\n";
	            index++;
	        }

	        return display;
	    }

	    protected HashSet<Consumables> getMenu() {
	        return menu;
	    }

	    public static void main(String[] args) {
	        System.out.println(new MenuBestOfV2().toString());
	    }


	}


