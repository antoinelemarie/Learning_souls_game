package lsg.buffs.rings;

import lsg.characters.Heros;

public class RingOfDeath extends Rings{
	
	private static float LIMIT = 0.5f ; 

	public RingOfDeath() {
		super("Ring of Death", 10000) ;
	}

	@Override
	public float computeBuffValue() {
		if (hero != null){
			float gauge = (float)hero.getLife() / hero.getMaxLife() ;
			if(gauge <= LIMIT) return power ;
			else return 0f ;
		}else return 0f ;
	}
	
	/**
	 * Un test...
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		Heros hero = new Heros() ;
		Rings r = new RingOfDeath() ;
		hero.setRing(r, 1);
		hero.GetHitWith(60) ; // pour abaisser les PV du hero
		System.out.println(r);
	}
	
}
