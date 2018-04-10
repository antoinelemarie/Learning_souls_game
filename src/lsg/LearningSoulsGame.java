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
import lsg.weapons.Claw;
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
	private Hero hero;
	private Monsters monster;
	private Swords sword;
	private Claw claw;
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		LearningSoulsGame lsg = new LearningSoulsGame();
		lsg.play_v1();
	}
	
	public void play_v1() {
		init();
		System.out.println(fight1v1(hero, monster));
	}
	
	public void init() {
		hero = new Hero( 200, 220);
		sword = new Swords( 10, 20, 2, 210);
		hero.setArme(sword);
		
		monster = new Monsters(100, 200);
		claw = new Claw(15, 30, 2, 210);
		monster.setArme(claw);
	}
	
	public void refresh(Hero Hero, Monsters monster) {
		
		System.out.println("Tour Suivant");
		System.out.println(Hero.printStats());
		System.out.println(monster.printStats());
		
	}
	
	public String fight1v1(Hero Hero, Monsters monster) {
		int dmg=0;
		refresh(Hero, monster);
		while (!(Hero.getLife()==0||monster.getLife()==0)) {
			
			// scan de la touche ici String nextline()
			dmg = (int) Hero.Attack();
			monster.setLife(monster.getLife() - dmg);
			
			dmg = (int) monster.Attack();
			Hero.setLife(Hero.getLife() - dmg);
			refresh(Hero, monster);
		}
		
		String strWin = Hero.getLife()==0 ? "Monster" : "Hero";
		return strWin+" Wins ! Fatality !";
		
	}
	

}
