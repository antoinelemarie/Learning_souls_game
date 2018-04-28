package lsg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;

import lsg.buffs.rings.Rings;
import lsg.characters.Characters;
import lsg.characters.Heros;
import lsg.characters.Lycanthropes;
import lsg.characters.Monsters;
import lsg.characters.Pnjs;
import lsg.characters.Sellers;
import lsg.consumable.MenuBestOfV1;
import lsg.equipements.Armors;
import lsg.helpers.Dice;
import lsg.weapons.Axes;
import lsg.weapons.BasicWeapons;
import lsg.weapons.Claws;
import lsg.weapons.Mass;
import lsg.weapons.Spears;
import lsg.weapons.Swords;
import lsg.weapons.Weapons;
import lsg.bags.Bags;
import lsg.bags.MediumBags;
import lsg.bags.SmallBags;
import lsg.buffs.BuffItem;
import lsg.buffs.rings.*;

/**
 * @author antoinelemarie
 * 
 * Class Main
 *
 */
public class LearningSoulsGame {
	private Heros hero;
	private Monsters monster;
	private Lycanthropes lycan;
	private Swords sword;
	private Claws claw;
	static Armors blackWitchVeil;
	static Armors ringedKnightArmor;
	static Armors dragonSlayerLeggings;
	static Rings ringOfDeath;
	
	Scanner scanner = new Scanner(System.in);
	
	public void play_v1() {
		init();
		fight1v1(hero, monster);
		System.out.println(fight1v1(hero, monster));
	}
	
	public void play_v2() {
		init();
		hero.setArmorItem(blackWitchVeil, 1);
		hero.setArmorItem(ringedKnightArmor, 2);
		hero.setArmorItem(dragonSlayerLeggings, 3);
		hero.setRing(ringOfDeath, 1);
		
		fight1v1(hero, monster);
	}
	
	public void play_v3() {
		init();
		hero.setArmorItem(blackWitchVeil, 1);
		hero.setArmorItem(dragonSlayerLeggings, 3);
		hero.setArmorItem(ringedKnightArmor, 2);
		hero.setRing(ringOfDeath, 1);

		fight1v1(hero, lycan);
	}
	
	public void init() {
		hero = new Heros( 200, 220);
		sword = new Swords( 10, 20, 2, 210);
		hero.setArme(sword);
		
		monster = new Monsters(100, 200);
		lycan = new Lycanthropes(120,200);
		
		claw = new Claws(15, 30, 2, 210);
		monster.setArme(claw);
		
		blackWitchVeil = new Armors("BlackWitchVeil", 4.6f);
		ringedKnightArmor = new Armors("RingedKnightArmor", 14.99f);
		dragonSlayerLeggings = new Armors("DragonSlayerLeggings", 10.2f);
		ringOfDeath = new Rings("RingOfDeath",150);
		
		
	}
	
	public void refresh(Heros hero, Monsters monster) {
		
		System.out.println("Tour Suivant");
		System.out.println(hero.printStats());
		System.out.println(monster.printStats());
		
	}

	
	public String fight1v1(Heros hero, Monsters monster) {

		System.out.println(monster.getName()+"---------------------");
		int dmg=0;
		refresh(hero, monster);
		while (!(hero.getLife()==0||monster.getLife()==0)) {
			
			scanner.nextLine();
			dmg = (int) hero.Attack();
			monster.GetHitWith(dmg);
			//monster.setLife(monster.getLife() - dmg);
			
			
			dmg = (int) monster.Attack();
			//hero.setLife(hero.getLife() - dmg);
			hero.GetHitWith(dmg);
			refresh(hero, monster);
			System.out.println("--------------------------------------");
		}
		
		String strWin = hero.getLife()==0 ? monster.getName() : "Hero";
		strWin = strWin+" Wins ! Fatality !";
		System.out.println(strWin);
		return strWin = strWin+" Wins ! Fatality !";
		
	}
	
	
	public static void main(String[] args) {
		LearningSoulsGame lsg = new LearningSoulsGame();
		Heros ch = new Heros();
		Bags mediumBag = new MediumBags();
		lsg.init();
		
		mediumBag.push(blackWitchVeil);
		mediumBag.push(ringOfDeath);
		
		System.out.println(mediumBag.toString());
		
		mediumBag.pop(blackWitchVeil);
		
		System.out.println(mediumBag.toString());
		
		
		MenuBestOfV1 menu = new MenuBestOfV1();
		menu.toString();
		//lsg.play_v2();
		lsg.play_v3();
		ch.createExhaustedHero();
		
//		System.out.println(dragonSlayerLeggings.toString());
//		System.out.println(ringedKnightArmor.toString());
	}
	
	
	

}
