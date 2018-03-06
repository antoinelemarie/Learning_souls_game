/**
 * 
 */

/**
 * @author antoinelemarie
 *
 */
public class hero {
	private String name;
	private int life;
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
}
