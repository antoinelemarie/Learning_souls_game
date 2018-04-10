package lsg.characters;

public class Monsters extends Characters{
	
	int skinThickness = 20;
	private static int instances_count = 0;
	
	public int getSkinThickness() {
		return skinThickness;
	}
	public void setSkinThickness(int skinThickness) {
		this.skinThickness = skinThickness;
	}
	/**
	 * @author antoinelemarie
	 * 
	 * Création de monstres hérité de la class Characters
	 * 
	 */
		
	public Monsters() {
		instances_count+=1;
		name = "monstre_"+instances_count;
		life = 10;
		stamina = 10;
		minAttack = 5;
		maxAttack = 10;
		
	}
	/**
	 * default @constructor
	 */
	public Monsters(String name) {
		this();
		this.name = name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Monsters(int monsterLife, int monsterStamina) {
		this();
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	/**
	 * @constructor
	 * life, stamina, min attack et max attack
	 */
	public Monsters(int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack) {
		this();
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
	}
	
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Monsters(String name,int monsterLife, int monsterStamina) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	/**
	 * @constructor
	 * life, name, stamina, min attack et max attack
	 */
	public Monsters(String name,int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
	}
	
	
}
