package lsg.buffs;

import java.util.Locale;

import lsg.bags.Collectibles;

public abstract class BuffItem implements Collectibles{
	
	private String name ; 
	
	public BuffItem(String name) {
		this.name = name ;
	}
	
	public abstract float computeBuffValue() ;
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format(Locale.US, "[%s, %.2f]", getName(), computeBuffValue()) ;
	}
	
	@Override
	public int getWeight() {
		return 1;//kg
	}
	
}
