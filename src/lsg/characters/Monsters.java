package lsg.characters;

import java.util.Locale;

import lsg.buffs.rings.Rings;
import lsg.buffs.talismans.Talismans;

public class Monsters extends Characters{
	
	float skinThickness = 20;
	private static int instances_count = 0;
	private static final int MAX_TALISMAN = 1;
	Talismans talismanEquiped[] = new Talismans[MAX_TALISMAN];
	
	
	public float getSkinThickness() {
		return skinThickness;
	}
	public void setSkinThickness(int skinThickness) {
		this.skinThickness = skinThickness;
	}
	@Override
	public float computeBuffValue() {
		return this.getTotalBuff();
	}
	
	
	public float getTotalBuff() {
		float totalBuff = 0;
		/*for (int i = 0; i < ringEquiped.length; i++) { //parcours le tableau
			if (ringEquiped[i] != null) {		//on vérifie qu'il y a un anneau
				Rings temp = ringEquiped[i];	//on crée un objet temporaire pour accéder aux méthodes de l'objet qui est dans le tableau
				totalBuff += temp.getPower();	//on utilise la méthode getPower qu'on ajoute au total
			}else {
				totalBuff += 0;
			}
			
		}*/
		return totalBuff;
	}
	/**
	 * @author antoinelemarie
	 * 
	 * Création de monstres hérité de la class Characters
	 * 
	 */
		
	public Monsters() {
		instances_count+=1;
		name = "monstre_"+instances_count;
		life = 10;
		stamina = 10;
		minAttack = 5;
		maxAttack = 10;
		
	}
	/**
	 * default @constructor
	 */
	public Monsters(String name) {
		this();
		this.name = name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Monsters(int monsterLife, int monsterStamina) {
		this();
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	
	/**
	 * @constructor
	 * life, stamina, min attack et max attack
	 */
	public Monsters(int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack) {
		this();
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
	}
	
	/**
	 * @constructor
	 * life, stamina, min attack, max attack et la peau du monstre (son armure)
	 */
	public Monsters(int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack, float skinTchickness) {
		this();
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
		this.skinThickness = skinTchickness;
	}
	
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Monsters(String name,int monsterLife, int monsterStamina) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
	}
	/**
	 * @constructor
	 * life, name, stamina, min attack et max attack
	 */
	public Monsters(String name,int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
	}
	
	/**
	 * @constructor
	 * life, name, stamina, min attack, max attack et la peau du monstre (son armure)
	 */
	public Monsters(String name,int monsterLife, int monsterStamina, int monsterMaxAttack, int monsterMinAttack, float skinThickness) {
		this();
		this.name = name;
		this.life = monsterLife;
		this.stamina = monsterStamina;
		this.minAttack = monsterMinAttack;
		this.maxAttack = monsterMaxAttack;
		this.skinThickness = skinThickness;
	}
	
	@Override
	public float computeProtection() {
		// TODO Auto-generated method stub
		return skinThickness;
	}
	
	public Talismans[] setRing(Talismans talisman, int slot) {
		// TODO Auto-generated method stub
		String var;
		slot = slot-1;
		if (slot > MAX_TALISMAN || slot < 0 ) {
			
			System.out.println(
					"L'emplacement de pièce d'armure doit correspondre soit a 1 : la tete, soit a 2 : le torse, soit a 3 : les jambes");
			return talismanEquiped;
		}else {
			
			talismanEquiped[slot] = talisman;
			var = String.format(Locale.US, "[%s, %.2f]", talisman.getName(), talisman.computeBuffValue());
			System.out.println(var);
			return talismanEquiped;
		
		}
	}
	
}
