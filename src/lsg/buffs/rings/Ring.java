package lsg.buffs.rings;

import lsg.buffs.BuffItem;
import lsg.characters.Heros;

public abstract class Ring extends BuffItem {
	
	protected int power ; 
	protected Heros hero ;
	
	public Ring(String name, int power) {
		super(name) ;
		this.power = power ;
	}
	
	public void setHero(Heros hero) {
		this.hero = hero;
	}
	
	public Heros getHero() {
		return hero;
	}
	
}
