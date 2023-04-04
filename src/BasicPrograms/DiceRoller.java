package BasicPrograms;

import java.util.Random;

public class DiceRoller {
	
	DiceRoller(){
	  // Instance of random class
		Random random = new Random();
		int number = 0;
		roll(random,number);
	}
	void roll(Random rando,int number) {
		number = rando.nextInt(6)+1;
		System.out.println(number);
	}
	

}
