package lsg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;

import lsg.characters.Characters;
import lsg.characters.Heros;
import lsg.characters.Lycanthropes;
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
	private Lycanthropes lycan;
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
		fight1v1(hero, monster);
	}
	
	public void play_v3() {
		init();
		hero.setArmorItem(blackWitchVeil, 1);
		hero.setArmorItem(dragonSlayerLeggings, 3);
		hero.setArmorItem(ringedKnightArmor, 2);

		fight1v1(hero, lycan);
	}
	
	public void init() {
		hero = new Heros( 200, 220);
		sword = new Swords( 10, 20, 2, 210);
		hero.setArme(sword);
		
		monster = new Monsters(100, 200);
		lycan = new Lycanthropes(120,200);
		
		claw = new Claws(15, 30, 2, 210);
		this.monster.setArme(claw);
		
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

		System.out.println(this.monster.getName()+"---------------------");
		int dmg=0;
		refresh(hero, this.monster);
		while (!(hero.getLife()==0||this.monster.getLife()==0)) {
			
			scanner.nextLine();
			dmg = (int) hero.Attack();
			this.monster.setLife(this.monster.getLife() - dmg);
			
			
			dmg = (int) this.monster.Attack();
			hero.setLife(hero.getLife() - dmg);
			refresh(hero, this.monster);
			System.out.println("--------------------------------------");
		}
		
		String strWin = hero.getLife()==0 ? this.monster.getName() : "Hero";
		strWin = strWin+" Wins ! Fatality !";
		System.out.println(strWin);
		return strWin = strWin+" Wins ! Fatality !";
		
	}
	
	
	public static void main(String[] args) {
		LearningSoulsGame lsg = new LearningSoulsGame();
		
		lsg.init();
		lsg.play_v2();
		
		
		System.out.println(blackWitchVeil.toString());
//		System.out.println(dragonSlayerLeggings.toString());
//		System.out.println(ringedKnightArmor.toString());
	}
	
	
	

}
