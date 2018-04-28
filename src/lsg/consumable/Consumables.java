/**
 * 
 */
package lsg.consumable;

import lsg.bags.Collectibles;

/**
 * @author antoinelemarie
 *
 */
public class Consumables implements Collectibles{

	/**
	 * 
	 */
	
	protected String name;
	protected int capacity;
	protected String stat;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * @param stat the stat to set
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}

	public Consumables() {
		// TODO Auto-generated constructor stub
	}
	
	public Consumables(String name, int capacity, String stat) {
		this.name = name;
		this.capacity = capacity;
		this.stat = stat;
		
	}
	
	public int use() {
		
		int capacity = this.getCapacity();
		this.setCapacity(0);
		
		return capacity;
	}
	
	@Override
	public String toString() {
		String var = "";

			var =String.format("%10s [%d %s point(s)] \n", this.getName(),this.getCapacity(),this.getStat());
		
		return var;
	}

	@Override
	public int getWeight() {
		return 1;//kg
	}

}
