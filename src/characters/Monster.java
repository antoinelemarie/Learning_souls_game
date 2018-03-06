package characters;

public class Monster {
	private String name = null;
	private int monsterLife = 0;
	private int strength = 0;
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
	protected int getStrength() {
		return strength;
	}
	protected void setStrength(int strength) {
		this.strength = strength;
	}
	
	
}
