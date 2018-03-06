package lsg.characters;

public class Monster {
	private String name;
	private int monsterLife;
	private int monsterStamina;
	private static int instances_count =0;
	
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
		instances_count+=1;
		name = "monstre_"+instances_count;
		monsterLife = 10;
		monsterStamina = 10;
		
	}
	
	public Monster(String name) {
		this();
		this.name = name;
		
	}
	public Monster(int monsterLife, int monsterStamina) {
		this();
		
		this.monsterLife = monsterLife;
		this.monsterStamina = monsterStamina;
	}
	public Monster(String name,int monsterLife, int monsterStamina) {
		this();
		this.name = name;
		this.monsterLife = monsterLife;
		this.monsterStamina = monsterStamina;
	}
	
	public boolean isAlive() {
		
		boolean alive = true;
		
		if (monsterLife == 0) {
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
			var = "[Monster] \t" + name + "\t life=" + monsterLife + "\t stamina=" + monsterStamina+"\t (Alive)";
		}
		if(isAlive() == false) {
			var = "[Monster] \t" + name + "\t life=" + monsterLife + "\t stamina=" + monsterStamina+"\t (Dead)";
		}
		return var;
	}
	
	public String printStats() {
		return this.toString();
		
	}
	
}
