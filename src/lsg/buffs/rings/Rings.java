package lsg.buffs.rings;

import lsg.buffs.BuffItem;
import lsg.characters.Heros;

public abstract class Rings extends BuffItem {
	
	protected int power ; 
	protected Heros hero ; //buff de dégats
	
	public Rings(String name, int power) {
		super(name) ;
		this.power = power ; 
	}
	
	public void setHero(Heros hero) {
		this.hero = hero;	//équiper l'anneau au héros
	}
	
	public Heros getHero() {
		return hero;
	}
	
}
