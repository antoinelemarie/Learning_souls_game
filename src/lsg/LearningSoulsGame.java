package lsg;

import java.util.ArrayList;

import lsg.characters.Hero;
import lsg.characters.Monsters;
import lsg.characters.Pnjs;
import lsg.helpers.Dice;
import lsg.weapons.Axes;
import lsg.weapons.Mass;
import lsg.weapons.Spears;
import lsg.weapons.Swords;
import lsg.weapons.Weapons;

/**
 * @author antoinelemarie
 * 
 * Class Main
 *
 */
public class LearningSoulsGame {

	
	public static void main(String[] args) {
		
		Hero hero = new Hero( 200, 30);
		System.out.println(hero.printStats());
		
		Monsters monster1 = new Monsters();
		System.out.println(monster1.printStats());
		
		Monsters monster2 = new Monsters();
		System.out.println(monster2.printStats());
		
		Monsters monster3 = new Monsters(0,10);
		System.out.println(monster3.printStats());
		
		Monsters boss = new Monsters("boss", 30, 29);
		System.out.println(boss.printStats());
		
		Monsters etudiator = new Monsters("etudiator");
		System.out.println(etudiator.printStats());
		
		Pnjs bobby = new Pnjs("Bobbyyyy!");
		System.out.println(bobby.printStats());
		
		Weapons wooden_staff = new Weapons();
		System.out.println(wooden_staff.printStats());
		
		Swords sword = new Swords();
		System.out.println(sword.printStats());
		
		Spears spear = new Spears();
		System.out.println(spear.printStats());
		
		Axes axe = new Axes();
		System.out.println(axe.printStats());
		
		Mass mass = new Mass();
		System.out.println(mass.printStats());
		
		
		Dice d = new Dice(50, 500);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < d.getNblancer(); i++) {
			int lance = Dice.roll();
			System.out.print(lance+" ");
			al.add(lance);
			
		};
		
		System.out.println("\nmin = " + Dice.min(al));
		System.out.println("max = " + Dice.max(al));
		
		Hero Az = new Hero( 200, 30);
		System.out.println(Az.precision.roll());
		
		
	}

}
