package lsg.characters;

import java.util.Arrays;
import java.util.Locale;

import lsg.buffs.rings.Rings;
import lsg.consumable.Consumables;
import lsg.equipements.Armors;

/**
 * @author antoinelemarie
 * 
 * Création de héros hérité de la class Characters
 * 
 */
public class Heros extends Characters{
	private static final int MAX_ARMOR_PIECES = 3;
	private static final int MAX_RINGS = 2;
	Armors armorEquiped[] = new Armors[MAX_ARMOR_PIECES];
	Rings ringEquiped[] = new Rings[MAX_RINGS];
	
	
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
					"L'emplacement de pièce d'armure doit correspondre soit a 1 : la tete, soit a 2 : le torse, soit a 3 : les jambes");
			return armorEquiped;
		}else {
			
		armorEquiped[slot] = armor;
		System.out.println("L'armure : " + armor.getName()+" de defense : "+ armor.getArmorValue() + " a ete equipee");
		return armorEquiped;
		
		}
	}
	
	
	@Override
	public float computeBuffValue() {
		return this.getTotalBuff();
	}
	
	
	public float getTotalBuff() {
		float totalBuff = 0;
		for (int i = 0; i < ringEquiped.length; i++) { //parcours le tableau
			if (ringEquiped[i] != null) {		//on vérifie qu'il y a un anneau
				Rings temp = ringEquiped[i];	//on crée un objet temporaire pour accéder aux méthodes de l'objet qui est dans le tableau
				totalBuff += temp.getPower();	//on utilise la méthode getPower qu'on ajoute au total
			}else {
				totalBuff += 0;
			}
			
		}
		return totalBuff;
	}

	public float getTotalArmor() {
		float total = 0;

		for (int i = 0; i < armorEquiped.length; i++) { //parcours le tableau
			if (armorEquiped[i] != null) {		//on vérifie qu'il y a une armure equipee
				Armors temp = armorEquiped[i];	//on crée un objet temporaire pour accéder aux méthodes de l'objet qui est dans le tableau
				total += temp.getArmorValue();	//on utilise la méthode getArmorValue qu'on ajoute au total
			}else {
				total += 0;
			}
			
		}
		
		return total;
	}
	
	public void armorToString() {
		
		float total = this.getTotalArmor();
		String var = "Armor : ";
		
		for (int i = 0; i < armorEquiped.length; i++) {
			
			if (armorEquiped[i] == null) {
				
				var +=String.format("%10d : empty",i+1);
			}else {
				Armors temp = armorEquiped[i];
				var +=String.format("%10d : %s ( %f )",i+1, temp.getName(),temp.getArmorValue());
			}
		}
//		return Arrays.toString(armorEquiped)+" TOTAL : "+total;
		System.out.println(var+"     TOTAL : "+total);
		
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
//		hero2.setArmorItem(ringedKnightArmor, 2);
		
		hero2.armorToString();
		
	}
	@Override
	public float computeProtection() {
		// TODO Auto-generated method stub
		
		return this.getTotalArmor();
	}
	public Rings[] setRing(Rings ring, int slot) {
		// TODO Auto-generated method stub
		String var;
		slot = slot-1;
		if (slot > MAX_RINGS || slot < 0 ) {
			
			System.out.println(
					"L'emplacement d'anneau doit correspondre soit a 1 : la main droite, soit a 2 : la main gauche");
			return ringEquiped;
		}else {
			
			ringEquiped[slot] = ring;
			var = String.format(Locale.US, "[%s, %.2f]", ring.getName(), ring.computeBuffValue());
			System.out.println(var);
			return ringEquiped;
		
		}
	}
	public void equip(Rings ring, int slot) {
		if(this.Cbag.contains(ring)) {
			this.Cbag.pop(ring);
			this.setRing(ring, slot);
		}
		System.out.println(this.getName()+" pulls out and equip/use "+ring.toString());
	}
	
	public void equip(Armors armor, int slot) {
		if(this.Cbag.contains(armor)) {
			this.Cbag.pop(armor);
			this.setArmorItem(armor, slot);
		}
		System.out.println(this.getName()+" pulls out and equip/use "+armor.toString());
	}
	
}
