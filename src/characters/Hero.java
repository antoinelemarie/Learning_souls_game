package characters;

/**
 * @author antoinelemarie
 *
 */
public class Hero {
	private String name = null;
	private int heroLife = 0;
	private Integer maxLife = 0;
	private int stamina = 0;
	private Integer maxStamina = 0;
	
	

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
	
	public void Hero(){
		
		name = "Ynovator";
		this.setName(name);
	}
	
	
	public void Hero(String name, int heroLife, int stamina) {
		if (name == null) {
			name = "Ynovator";
		}
		this.setName(name);
		this.setHeroLife(heroLife);
		this.setStamina(stamina);
		
	}
	
	public String printStats(String name, int heroLife, int stamina) {
		return this.toString();
		
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
	
	
}
