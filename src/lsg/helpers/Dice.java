package lsg.helpers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
	static int faces;
	static Random random = new Random();
	static int nblancer;
	static int maxVal = Integer.MAX_VALUE;
    static int minVal = Integer.MIN_VALUE;
	
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
	
	public Dice(){
		faces = 6;
		
	}
	
	public Dice(int faces, int nblancer){
		this();
		this.faces = faces;
		this.nblancer = nblancer;
	}
	

	public static int roll() {
		return random.nextInt(faces);
	}
	
	public static int max(ArrayList<Integer> al) {
		Integer[] array = (Integer[]) al.toArray();
		for(int i = 0; i < array.length; i++){
	         if(array[i] < maxVal)
	           maxVal = array[i];
	       }
		return maxVal;
	}
	
	public static int min(ArrayList<Integer> al) {
		Integer[] array = (Integer[]) al.toArray();
		for(int i = 0; i < array.length; i++){
	         if(array[i] > minVal)
	           minVal = array[i];
	       }
		return minVal;
	}
	
}
