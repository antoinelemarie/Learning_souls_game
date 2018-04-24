/**
 * 
 */
package lsg.consumable;

import java.util.HashSet;

import lsg.consumable.drinks.*;
import lsg.consumable.foods.*;

/**
 * @author antoinelemarie
 *
 */
public class MenuBestOfV1 {

    private Consumables[] menu;

    public MenuBestOfV1() {
        this.menu = new Consumables[5];

        this.menu[0] = new Hamburgers();
        this.menu[1] = new Wines();
        this.menu[2] = new Americains();
        this.menu[3] = new Coffes();
        this.menu[4] = new Whiskys();
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

    public static void main(String[] args) {
        System.out.println(new MenuBestOfV1().toString());
    }
}
