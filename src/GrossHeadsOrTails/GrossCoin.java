package GrossHeadsOrTails;//package declaration

import java.util.Random;//import random


public class GrossCoin {  // create public class GrossHeadsOrTails for constructors
	private int sideUp;
	
	public int toss() {
		Random random = new Random(); //create new random instance
		int randomResult; //create int for random
		
		randomResult = random.nextInt(2)+1; //random result between 1-2
		if(randomResult ==1) { //if equal 1 then sideUp = heads
			sideUp = 1;
		}
		if(randomResult ==2) {//if equal 2 then sideUp = tails
			sideUp = 2;
		
		}
	return sideUp;	
	}
	
}
