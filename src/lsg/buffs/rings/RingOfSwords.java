package lsg.buffs.rings;

import lsg.characters.Heros;
import lsg.weapons.Swords;

public class RingOfSwords extends Ring{
	
	public RingOfSwords() {
		super("Ring of Swords", 10) ;
	}
	
	@Override
	public float computeBuffValue() {
		if (hero != null && (hero.getArme() instanceof Swords) )  return power ;
		else return 0f ;
		
	}
	
	/**
	 * Un test...
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		Heros hero = new Heros() ;
		RingOfSwords r = new RingOfSwords() ;
		hero.setRing(r, 1);
		hero.setArme(new Swords());
		System.out.println(r);
	}
}
