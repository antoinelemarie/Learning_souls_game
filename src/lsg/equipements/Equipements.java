package lsg.equipements;

public class Equipements {

	protected String name;
	protected float armorValue;
	protected int durability;
	protected int maxDurability;
	
	
	public String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	public float getArmorValue() {
		return armorValue;
	}


	protected void setArmorValue(float armorValue) {
		this.armorValue = armorValue;
	}


	public int getDurability() {
		return durability;
	}


	protected void setDurability(int durability) {
		this.durability = durability;
	}


	public int getMaxDurability() {
		return maxDurability;
	}


	protected void setMaxDurability(int maxDurability) {
		this.maxDurability = maxDurability;
	}


	public Equipements() {
		// TODO Auto-generated constructor stub
		name = "coton shirt";
		armorValue = 1;
		durability = 10;
		maxDurability = 10;
		
	}
	
	public Equipements(String name, float armorValue) {
		this.name = name;
		this.armorValue = armorValue;
	}
	
	/*
	 * Methode -1 en durabilite
	 */
	public void use(){
		this.setDurability(this.durability-1);
	}
	
	/*
	 * Verifie si l'arme est brisee
	 * @return boolean si l'arme a 0 ou moins en durabilite
	 */
	public boolean isBroken() {
		if (this.getDurability()<1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String var = "";
		if(isBroken() == false) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s( %f) (usable)\n", this.getName(),this.getArmorValue());
		}
		if(isBroken() == true) {
			var =String.format("%-20s","["+this.getClass().getSimpleName()+"]")+String.format("%-20s( %f) (broken)\n", this.getName(),this.getArmorValue());
		}
		return var;
	}
	
	public String printStats() {
		return this.toString();
		
	}
}
