package lsg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;

import lsg.characters.Characters;
import lsg.characters.Heros;
import lsg.characters.Monsters;
import lsg.characters.Pnjs;
import lsg.characters.Sellers;
import lsg.equipements.Armors;
import lsg.helpers.Dice;
import lsg.weapons.Axes;
import lsg.weapons.BasicWeapons;
import lsg.weapons.Claws;
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
	private Heros hero;
	private Monsters monster;
	private Swords sword;
	private Claws claw;
	static Armors blackWitchVeil;
	static Armors dragonSlayerLeggings;
	static Armors ringedKnightArmor;
	
	Scanner scanner = new Scanner(System.in);
	
	public void play_v1() {
		init();
		System.out.println(fight1v1(hero, monster));
	}
	
	public void init() {
		hero = new Heros( 200, 220);
		sword = new Swords( 10, 20, 2, 210);
		hero.setArme(sword);
		
		monster = new Monsters(100, 200);
		claw = new Claws(15, 30, 2, 210);
		monster.setArme(claw);
		
		blackWitchVeil = new Armors("BlackWitchVeil", (float) 4.6);
		dragonSlayerLeggings = new Armors("DragonSlayerLeggings", (float) 10.2);
		ringedKnightArmor = new Armors("RingedKnightArmor", (float) 14.99);
		
		
	}
	
	public void refresh(Heros hero, Monsters monster) {
		
		System.out.println("Tour Suivant");
		System.out.println(hero.printStats());
		System.out.println(monster.printStats());
		
	}

	
	public String fight1v1(Heros hero, Monsters monster) {
		int dmg=0;
		refresh(hero, monster);
		while (!(hero.getLife()==0||monster.getLife()==0)) {
			
			// scan de la touche ici String nextline()
			scanner.nextLine();
			dmg = (int) hero.Attack();
			monster.setLife(monster.getLife() - dmg);
			
			dmg = (int) monster.Attack();
			hero.setLife(hero.getLife() - dmg);
			refresh(hero, monster);
		}
		
		String strWin = hero.getLife()==0 ? "Monster" : "Hero";
		return strWin+" Wins ! Fatality !";
		
	}
	
	
	public static void main(String[] args) {
		LearningSoulsGame lsg = new LearningSoulsGame();
		//lsg.play_v1();
		lsg.init();
		
		System.out.println(blackWitchVeil.printStats());
		System.out.println(dragonSlayerLeggings.printStats());
		System.out.println(ringedKnightArmor.printStats());
	}
	
	
	

}
