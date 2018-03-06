package characters;

/**
 * @author antoinelemarie
 *
 */
public class LearningSoulsGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hero hero = new Hero();
		String name = null;
		int herolife = 100;
		int stamina = 50;
		System.out.println(hero.printStats(name, herolife, stamina));
		
		Monster monstre = new Monster();
		int monsterLife = 10;
		int strengh = 10;
	}

}
