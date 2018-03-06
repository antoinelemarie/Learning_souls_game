package lsg.characters;

/**
 * @author antoinelemarie
 *
 */
public class Hero extends Characters{
	
	public Hero(){
		name = "Ynovator";
		life = 100;
		maxLife = 1000;
		stamina = 50;
		maxStamina = 5000;
		this.setName(name);
	}
	
	public Hero(String name) {
		this();
		this.name= name;
		
	}
	public Hero( int life, int stamina) {
		this();
		this.life = life;
		this.stamina = stamina;
		
	}
	public Hero(String name, int life, int stamina) {
		this();
		this.name= name;
		this.life = life;
		this.stamina = stamina;
		
	}
	
}
