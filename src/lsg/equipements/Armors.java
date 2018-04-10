/**
 * 
 */
package lsg.equipements;

/**
 * @author antoinelemarie
 *
 */
public class Armors extends Equipements {

	/**
	 * default constructor
	 */
	public Armors() {
		super();
		name = "wooden armor";
		armorValue = 5;
	}
	
	public Armors(String name, float armorValue) {
		this();
		this.name = name;
		this.armorValue = armorValue;
	}

}
