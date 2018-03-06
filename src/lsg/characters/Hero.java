package lsg.characters;

/**
 * @author antoinelemarie
 *
 */
public class Hero {
	private String name = null;
	private int heroLife;
	private Integer maxLife;
	private int stamina;
	private Integer maxStamina;
	
	

	protected int getStamina() {
		return stamina;
	}

	protected void setStamina(int stamina) {
		this.stamina = stamina;
	}

	protected Integer getMaxStamina() {
		return maxStamina;
	}

	protected void setMaxStamina(Integer maxStamina) {
		this.maxStamina = maxStamina;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getHeroLife() {
		return heroLife;
	}

	protected void setHeroLife(int heroLife) {
		this.heroLife = heroLife;
	}

	protected Integer getMaxLife() {
		return maxLife;
	}

	protected void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}
	
	public Hero(){
		name = "Ynovator";
		heroLife = 100;
		maxLife = 1000;
		stamina = 50;
		maxStamina = 5000;
		this.setName(name);
	}
	
	
	public Hero(String name, int heroLife, int stamina) {
		this();
		this.name= name;
		this.heroLife = heroLife;
		this.stamina = stamina;
		
	}
	public boolean isAlive() {
		
		boolean alive = true;
		
		if (heroLife == 0) {
			alive = false;
		}else {
			alive = true;
		}
		return alive;
	}

	@Override
	public String toString() {
		String var = "";
		if(isAlive() == true) {
			var = "[Hero] \t" + name + "\t life=" + heroLife + "\t stamina=" + stamina+"\t (Alive)";
		}
		if(isAlive() == false) {
			var = "[Hero] \t" + name + "\t life=" + heroLife + "\t stamina=" + stamina+"\t (Dead)";
		}
		return var;
	}
	
	public String printStats() {
		return this.toString();
		
	}
	
	
	
}
