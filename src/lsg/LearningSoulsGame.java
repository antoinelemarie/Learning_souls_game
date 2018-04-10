package lsg;

import java.util.ArrayList;

import lsg.characters.Characters;
import lsg.characters.Hero;
import lsg.characters.Monsters;
import lsg.characters.Pnjs;
import lsg.characters.Sellers;
import lsg.helpers.Dice;
import lsg.weapons.Axes;
import lsg.weapons.BasicWeapons;
import lsg.weapons.Mass;
import lsg.weapons.Spears;
import lsg.weapons.Swords;
import lsg.weapons.Weapons;
import util.Scanner;

/**
 * @author antoinelemarie
 * 
 * Class Main
 *
 */
public class LearningSoulsGame {
	Hero hero;
	Monsters monster;
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Hero hero = new Hero( 200, 220);
		System.out.println(hero.printStats());
		
		Monsters monster1 = new Monsters(100, 200);
		System.out.println(monster1.printStats());
		
		Swords new_sword = new Swords("Gilbert Berangeru nasty sauce du granu jnounu de trois semainu de feu", 999999999, 999999999, 999999999);
		System.out.println(new_sword.printStats());

		Swords sword = new Swords(60, 210, 210);
		//System.out.println(sword.printStats());
		
		Swords branch = new Swords();
		//System.out.println(branch.printStats());
;
		
		hero.setArme(sword);
		monster1.setArme(branch);
		
		hero.Attack();
		
		//System.out.println("1 "+monster1.printStats());
		
		monster1.Attack();
		
		//System.out.println("2 "+hero.printStats());
		
		hero.Attack();
		
		//System.out.println("3 "+monster1.printStats());
		
		hero.Attack();
		
		//System.out.println("4 "+monster1.printStats());
		
		monster1.Attack();
		
		//System.out.println("5 "+hero.printStats());
		
		hero.Attack();
		
		//System.out.println("5 "+hero.printStats());

		hero.Attack();
		
		//System.out.println("5 "+hero.printStats());
		
		
		
	}

}
