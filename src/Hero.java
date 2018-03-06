/**
 * 
 */

/**
 * @author antoinelemarie
 *
 */
public class Hero {
	private String name = null;
	private int life = 0;
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

	protected int getLife() {
		return life;
	}

	protected void setLife(int life) {
		this.life = life;
	}

	protected Integer getMaxLife() {
		return maxLife;
	}

	protected void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}
	
	public void hero(){
		
		name = "Ynovator";
		this.setName(name);
	}
	
	
	public void hero(String name, int life, int stamina) {
		if (name == null) {
			name = "Ynovator";
		}
		this.setName(name);
		this.setLife(life);
		this.setStamina(stamina);
		
	}
	
	public String printStats(String name, int life, int stamina) {
		return this.toString();
		
	}

	@Override
	public String toString() {
		String var = "";
		if(isAlive() == true) {
			var = "[Hero] \t" + name + "\t life=" + life + "\t stamina=" + stamina+"\t (Alive)";
		}
		if(isAlive() == false) {
			var = "[Hero] \t" + name + "\t life=" + life + "\t stamina=" + stamina+"\t (Dead)";
		}
		return var;
	}
	
	public boolean isAlive() {
		if (life == 0) {
			return false;
		}else {
			return true;
		}
	}
}
