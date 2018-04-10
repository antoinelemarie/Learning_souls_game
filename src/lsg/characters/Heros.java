package lsg.characters;


/**
 * @author antoinelemarie
 * 
 * Création de héros hérité de la class Characters
 * 
 */
public class Heros extends Characters{
	
	public Heros(){
		name = "Ynovator";
		life = 100;
		maxLife = 1000;
		stamina = 50;
		maxStamina = 5000;
		this.setName(name);
	}
	/**
	 * default @constructor
	 */
	public Heros(String name) {
		this();
		this.name= name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Heros( int life, int stamina) {
		this();
		this.life = life;
		this.stamina = stamina;
		
	}
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Heros(String name, int life, int stamina) {
		this();
		this.name= name;
		this.life = life;
		this.stamina = stamina;
		
	}
	
}
