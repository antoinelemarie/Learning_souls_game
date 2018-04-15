package lsg.characters;

public class Pnjs extends Characters{
	/**
	 * @author antoinelemarie
	 * 
	 * Création de PNJ hérité de la class Characters
	 * 
	 */
	/**
	 * default @constructor
	 */
	public Pnjs(){
		name = "Ynovator";
		life = 50;
		maxLife = 100000000;
		stamina = 10;
		maxStamina = 50000000;
		this.setName(name);
	}
	/**
	 * @constructor
	 */
	public Pnjs(String name) {
		this();
		this.name= name;
		
	}
	/**
	 * @constructor
	 */
	public Pnjs(String name, int life, int stamina) {
		this();
		this.name= name;
		this.life = life;
		this.stamina = stamina;
		
	}
	@Override
	public float computeProtection() {
		// TODO Auto-generated method stub
		return 0;
	}
}
