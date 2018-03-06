package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;

/**
 * @author antoinelemarie
 *
 */
public class LearningSoulsGame {

	
	public static void main(String[] args) {
		
		
		Hero hero = new Hero("bobby", 200, 30);
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
		
		
		
	}

	
}
