package lsg.characters;

import java.util.Arrays;

import lsg.equipements.Armors;

/**
 * @author antoinelemarie
 * 
 * Création de héros hérité de la class Characters
 * 
 */
public class Heros extends Characters{
	Armors armorEquiped[] = new Armors[3];
	private static final int MAX_ARMOR_PIECES = 3;
	
	public Heros(){
		name = "Ynovator";
		life = 100;
		maxLife = 1000;
		stamina = 50;
		maxStamina = 5000;
		this.setName(name);
	}
	/**
	 * default @constructor
	 */
	public Heros(String name) {
		this();
		this.name= name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Heros( int life, int stamina) {
		this();
		this.life = life;
		this.stamina = stamina;
		
	}
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Heros(String name, int life, int stamina) {
		this();
		this.name= name;
		this.life = life;
		this.stamina = stamina;
		
	}
	public Armors[] setArmorItem(Armors armor, int slot) {
		slot = slot-1;
		if (slot > MAX_ARMOR_PIECES || slot < 0 ) {
			
			System.out.println(
					"L'emplacement de pièce d'armure doit correspondre soit a 1 : la tete, soit a 2 : le trorse, soit a 3 : les jambes");
			return armorEquiped;
		}else {
			
		armorEquiped[slot] = armor;
		System.out.println("The piece of armor : " + armor + " has been equiped");
		return armorEquiped;
		
		}
	}
	
	public float getTotalArmor() {
		float total = 0;

		for (int i = 0; i < armorEquiped.length; i++) {
			Armors temp = armorEquiped[i];
			total += temp.getArmorValue();
		}
		
		return total;
	}
	
	public String armorToString() {
		
		float total = this.getTotalArmor();
		String var = "Armor : ";
		
		for (int i = 0; i < armorEquiped.length; i++) {
			
			if (armorEquiped[i] == null) {
				
				var +=String.format("%-20d : empty",i+1);
				
			}else {
			
				Armors temp = armorEquiped[i];
				var +=String.format("%-20d : %s (%f)",i+1, temp.getName(),temp.getArmorValue());
			}
		}
		
		return Arrays.toString(armorEquiped)+"\n TOTAL : "+total;
		
	}
	
	public Armors[] getArmorItem() {
		Armors tableau[] = new Armors[3];
		int j = 0;
		
		for (int i = 0; i < armorEquiped.length; i++) {
			
			if (armorEquiped[i] == null) {
				continue;
			}else {
				tableau[j] = armorEquiped[i];
				j++;
			}
		}
		Armors tableau1[]= new Armors[j];
		tableau1 = tableau;
		return tableau1;
	}
	
	public static void main(String[] args) {
		
		Heros hero2 = new Heros();
		Armors blackWitchVeil = new Armors("BlackWitchVeil", 4.6f);
		Armors dragonSlayerLeggings = new Armors("DragonSlayerLeggings", 10.2f);
		Armors ringedKnightArmor = new Armors("RingedKnightArmor", 14.99f);
		
		hero2.setArmorItem(blackWitchVeil, 1);
		hero2.setArmorItem(dragonSlayerLeggings, 3);
		hero2.setArmorItem(ringedKnightArmor, 2);
		
		hero2.armorToString();
		
	}
	
}
