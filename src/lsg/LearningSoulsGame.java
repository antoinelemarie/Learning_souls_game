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

/**
 * @author antoinelemarie
 * 
 * Class Main
 *
 */
public class LearningSoulsGame {

	
	public static void main(String[] args) {
		
		Hero hero = new Hero( 200, 220);
		System.out.println(hero.printStats());
		
		Monsters monster1 = new Monsters(100, 200);
		System.out.println(monster1.printStats());
//		
//		Monsters monster2 = new Monsters();
//		System.out.println(monster2.printStats());
//		
//		Monsters monster3 = new Monsters(0,10);
//		System.out.println(monster3.printStats());
//		
//		Monsters boss = new Monsters("boss", 30, 40);
//		System.out.println(boss.printStats());
//		
//		Monsters etudiator = new Monsters("etudiator");
//		System.out.println(etudiator.printStats());
//		
//		Pnjs bobby = new Pnjs("Bobbyyyy!");
//		System.out.println(bobby.printStats());
//		
//		Sellers marchand = new Sellers("Marchand");
//		System.out.println(marchand.printStats());
//		
//		Weapons wooden_staff = new Weapons();
//		System.out.println(wooden_staff.printStats());
//		
		Swords sword = new Swords(60, 210, 210);
		System.out.println(sword.printStats());
		
		Swords branch = new Swords();
		System.out.println(branch.printStats());
//		
//		Spears spear = new Spears();
//		System.out.println(spear.printStats());
//		
//		Axes axe = new Axes();
//		System.out.println(axe.printStats());
//		
//		Mass mass = new Mass();
//		System.out.println(mass.printStats());
		
		hero.setArme(sword);
		monster1.setArme(branch);
		
		hero.Attack();
		
		System.out.println("1 "+monster1.printStats());
		
		monster1.Attack();
		
		System.out.println("2 "+hero.printStats());
		
		hero.Attack();
		
		System.out.println("3 "+monster1.printStats());
		
		hero.Attack();
		
		System.out.println("4 "+monster1.printStats());
		
		monster1.Attack();
		
		System.out.println("5 "+hero.printStats());
		
		hero.Attack();
		
		System.out.println("5 "+hero.printStats());

		hero.Attack();
		
		System.out.println("5 "+hero.printStats());
		
		
		
	}

}
