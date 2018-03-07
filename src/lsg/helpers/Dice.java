package lsg.helpers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
	static int faces;
	static Random random = new Random();
	static int nblancer;
	static Integer maxVal = Integer.MAX_VALUE;
    static Integer minVal = Integer.MIN_VALUE;
	
	public Random getRandom() {
		return random;
	}
	
	public int getFaces() {
		return faces;
	}
	
	public void setFaces(int faces) {
		this.faces = faces;
	}
	
	public int getNblancer() {
		return nblancer;
	}

	public static void setNblancer(int nblancer) {
		Dice.nblancer = nblancer;
	}
	
	/**
	 * default @constructor
	 */
	public Dice(){
		faces = 6;
		nblancer = 1;
		
	}
	/**
	 * @constructor
	 */
	public Dice(int faces){
		this();
		this.faces = faces;
	}
	
	/**
	 * @constructor
	 */
	public Dice(int faces, int nblancer){
		this();
		this.faces = faces;
		this.nblancer = nblancer;
	}
	

	public static int roll() {
		return random.nextInt(faces);
	}
	
	public static int min(ArrayList<Integer> al) {
		for(int i = 0; i < al.size(); i++){
	         if(al.get(i) < maxVal)
	           maxVal = al.get(i);
	       }
		return maxVal;
	}
	
	public static int max(ArrayList<Integer> al) {
		for(int i = 0; i < al.size(); i++){
	         if(al.get(i) > minVal)
	           minVal = al.get(i);
	       }
		return minVal;
	}
	
}
