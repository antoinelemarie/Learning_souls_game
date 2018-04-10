package lsg.equipements;

public class Equipements {

	protected String name;
	protected float armorValue;
	
	
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected float getArmorValue() {
		return armorValue;
	}


	protected void setArmorValue(float armorValue) {
		this.armorValue = armorValue;
	}


	public Equipements() {
		// TODO Auto-generated constructor stub
		name = "coton shirt";
		armorValue = 3;
	}
	
	public Equipements(String name, float armorValue) {
		this.name = name;
		this.armorValue = armorValue;
	}

}
