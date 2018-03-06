package lsg.characters;

public class Pnj extends Characters{
	/**
	 * @author antoinelemarie
	 * 
	 * Création de PNJ hérité de la class Characters
	 * 
	 */
	
	public Pnj(){
		name = "Ynovator";
		life = 50;
		maxLife = 100000000;
		stamina = 10;
		maxStamina = 50000000;
		this.setName(name);
	}
	
	public Pnj(String name) {
		this();
		this.name= name;
		
	}
	public Pnj(String name, int life, int stamina) {
		this();
		this.name= name;
		this.life = life;
		this.stamina = stamina;
		
	}
}
