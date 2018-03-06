

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
		int life = 100;
		int stamina = 50;
		System.out.println(hero.printStats(name, life, stamina));
	}

}
