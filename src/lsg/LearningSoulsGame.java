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
	static Armors ringedKnightArmor;
	static Armors dragonSlayerLeggings;
	
	Scanner scanner = new Scanner(System.in);
	
	public void play_v1() {
		init();
		fight1v1(hero, monster);
		System.out.println(fight1v1(hero, monster));
	}
	
	public void play_v2() {
		init();
		hero.setArmorItem(blackWitchVeil, 1);
		hero.setArmorItem(dragonSlayerLeggings, 3);
		hero.setArmorItem(ringedKnightArmor, 2);
		System.out.println(fight1v1(hero, monster));
	}
	
	public void init() {
		hero = new Heros( 200, 220);
		sword = new Swords( 10, 20, 2, 210);
		hero.setArme(sword);
		
		monster = new Monsters(100, 200);
		claw = new Claws(15, 30, 2, 210);
		monster.setArme(claw);
		
		blackWitchVeil = new Armors("BlackWitchVeil", 4.6f);
		ringedKnightArmor = new Armors("RingedKnightArmor", 14.99f);
		dragonSlayerLeggings = new Armors("DragonSlayerLeggings", 10.2f);
		
		
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
		lsg.play_v2();
		lsg.init();
		
//		System.out.println(blackWitchVeil.printStats());
//		System.out.println(dragonSlayerLeggings.printStats());
//		System.out.println(ringedKnightArmor.printStats());
	}
	
	
	

}
