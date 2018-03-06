package characters;

public class Monster {
	private String name = null;
	private int monsterLife = 0;
	private int monsterStamina = 0;
	private int i = 0;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getMonsterLife() {
		return monsterLife;
	}
	protected void setMonsterLife(int monsterLife) {
		this.monsterLife = monsterLife;
	}
	protected int getMonsterStamina() {
		return monsterStamina;
	}
	protected void setMonsterStamina(int monsterStamina) {
		this.monsterStamina = monsterStamina;
	}
	
	public Monster() {
		
		name = "monstre_"+i;
		
	}
	
	public Monster(String name, int monsterLife, int monsterStamina) {
		this.name = name;
		monsterLife = 0;
		monsterStamina = 0;
	}
	
}
