/**
 * 
 */
package lsg.characters;

import lsg.weapons.Claws;
import lsg.weapons.Weapons;

/**
 * @author antoinelemarie
 *
 */
public class Lycanthropes extends Monsters {

	private static int instances_count = 0;
	Claws claw = new Claws(50, 150);
	float skinThickness;

	/**
	 * 
	 */
	public Lycanthropes() {
		// TODO Auto-generated constructor stub
		instances_count+=1;
		name = "Lycanthrope"+instances_count;
		skinThickness= 30;
		this.setArme(claw);
		
	}
	
	public Lycanthropes(String name) {
		this();
		this.name = name;
		
	}
	/**
	 * @constructor
	 * life et stamina
	 */
	public Lycanthropes(int LycanthropeLife, int LycanthropeStamina) {
		this();
		this.life = LycanthropeLife;
		this.stamina = LycanthropeStamina;
	}
	
	/**
	 * @constructor
	 * life, stamina, min attack, max attack et la peau du monstre (son armure)
	 */
	public Lycanthropes(int LycanthropeLife, int LycanthropeStamina, int LycanthropeMaxAttack, int LycanthropeMinAttack, float skinTchickness) {
		this();
		this.life = LycanthropeLife;
		this.stamina = LycanthropeStamina;
		this.claw.setMinDamage(LycanthropeMinAttack);
		this.claw.setMaxDamage(LycanthropeMaxAttack);
		this.skinThickness = skinTchickness;
	}
	
	/**
	 * @constructor
	 * life, stamina, min attack, max attack 
	 */
	public Lycanthropes(int LycanthropeLife, int LycanthropeStamina, int LycanthropeMaxAttack, int LycanthropeMinAttack) {
		this();
		this.life = LycanthropeLife;
		this.stamina = LycanthropeStamina;
		this.claw.setMinDamage(LycanthropeMinAttack);
		this.claw.setMaxDamage(LycanthropeMaxAttack);
	}
	
	/**
	 * @constructor
	 * nom, life et stamina
	 */
	public Lycanthropes(String name,int LycanthropeLife, int LycanthropeStamina) {
		this();
		this.name = name;
		this.life = LycanthropeLife;
		this.stamina = LycanthropeStamina;
	}

}
