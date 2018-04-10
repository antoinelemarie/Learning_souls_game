package lsg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;

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
	static Hero hero;
	static Monsters monster;
	Scanner scanner = new Scanner(System.in);
	
	
public static void refresh(Hero Hero, Monsters monster) {
		
		System.out.println("Tour Suivant");
		System.out.println(Hero.printStats());
		System.out.println(monster.printStats());
		
	}
	
	public static String fight1v1(Hero Hero, Monsters monster) {
		int dmg=0;
		/*while (!(Hero.getLife()==0||monster.getLife()==0)) {*/
			refresh(Hero, monster);
			// scan de la touche ici String nextline()
			System.out.println("test");
			dmg = (int) Hero.Attack();
			monster.setLife(monster.getLife() - dmg);
		/*}*/
			return "Wins";
		
	}
	
	public static void main(String[] args) {
		
		
		
		Hero hero = new Hero( 200, 220);
		Swords sword = new Swords(2, 210, 210);
		hero.setArme(sword);
		
		Monsters monster1 = new Monsters(100, 200);
		Swords sword1 = new Swords(2, 210, 210);
		monster.setArme(sword1);
		
		fight1v1(hero, monster1);
		
		/*
		Swords new_sword = new Swords("Gilbert Berangeru nasty sauce du granu jnounu de trois semainu de feu", 999999999, 999999999, 999999999);
		System.out.println(new_sword.printStats());

		Swords sword = new Swords(60, 210, 210);
		//System.out.println(sword.printStats());
		
		Swords branch = new Swords();
		//System.out.println(branch.printStats());;
		
		hero.setArme(sword);
		monster1.setArme(branch);
		
		hero.Attack();
		
		//System.out.println("1 "+monster1.printStats());
		
		monster1.Attack();
		
		//System.out.println("2 "+hero.printStats());
		*/
		
	}
	

}
