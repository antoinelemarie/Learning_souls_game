package lsg.characters;

public class Monster extends Characters{
	
	private static int instances_count = 0;
	/**
	 * @author antoinelemarie
	 * 
	 * Création de monstres hérité de la class Characters
	 * 
	 */
		
	public Monster() {
		instances_count+=1;
		name = "monstre_"+instances_count;
		life = 10;
		stamina = 10;
		
	}
	/**
	 * default @constructor
	 */
	public Monster(String name) {
		this();
		this.name = name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Monster(int monsterLife, int monsterStamina) {
		this();
		
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Monster(String name,int monsterLife, int monsterStamina) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	
	
}
