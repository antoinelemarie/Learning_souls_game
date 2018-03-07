package lsg;

import java.util.ArrayList;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.characters.Pnj;
import lsg.helpers.Dice;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;

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
		
		Monster monster1 = new Monster();
		System.out.println(monster1.printStats());
		
		Monster monster2 = new Monster();
		System.out.println(monster2.printStats());
		
		Monster monster3 = new Monster(0,10);
		System.out.println(monster3.printStats());
		
		Monster boss = new Monster("boss", 30, 29);
		System.out.println(boss.printStats());
		
		Monster etudiator = new Monster("etudiator");
		System.out.println(etudiator.printStats());
		
		Pnj bobby = new Pnj("Bobbyyyy!");
		System.out.println(bobby.printStats());
		
		Weapon wooden_staff = new Weapon();
		System.out.println(wooden_staff.printStats());
		
		Sword sword = new Sword();
		System.out.println(sword.printStats());
		
		
		Dice d = new Dice(50, 500);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < d.getNblancer(); i++) {
			int lance = Dice.roll();
			System.out.print(lance+" ");
			al.add(lance);
			
		};
		
		System.out.println("\nmin = " + Dice.min(al));
		System.out.println("max = " + Dice.max(al));
		
		
	}

}
