package lsg.buffs.rings;

import lsg.equipements.*;

public class DragonSlayerRing extends Rings{
	
	public DragonSlayerRing() {
		super("Dragon Slayer Ring", 14) ;
	}
	
	@Override
	public float computeBuffValue() {
		if(hero != null && hasDragonsSlayerItem()){
			return power ;
		}else return 0 ;
	}
	
	private boolean hasDragonsSlayerItem(){
		Armors[] items = hero.getArmorItem() ;
		for(Armors item: items){
			if(item instanceof DragonSlayerLeggings) return true ; 
		}
		return false ;
	}
	
}
