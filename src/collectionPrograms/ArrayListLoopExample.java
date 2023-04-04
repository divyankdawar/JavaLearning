package collectionPrograms;

import java.util.ArrayList;

//Write a program to traverse (or iterate) ArrayList? 

public class ArrayListLoopExample {
	public static void main(String args[]) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(3);
		ar1.add(14);
		ar1.add(9);
		ar1.add(30);
		System.out.println("Using Advanced for Loop");

		for(Integer num:ar1) {
			System.out.println(num);
		}

	}

}