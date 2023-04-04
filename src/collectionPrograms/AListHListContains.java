package collectionPrograms;

import java.util.ArrayList;
import java.util.HashSet;

//Given an element write a program to check if element(value) exists in ArrayList?
//Given an element write a program to check if element exists in HashSet?


public class AListHListContains {
	public static void main(String args[]) {
		ArrayList<Integer> al = new  ArrayList<Integer>();
		HashSet<String> hs = new HashSet<String>();
		al.add(1);
		al.add(6);
		al.add(7);
		al.add(9);
		hs.add("Divyank");
		hs.add("Dawar");
		hs.add("Neeru");
		hs.add("Ankita");

		if(al.contains(7)) {
			System.out.println("Elemet is present in the array List");
		}
		else {
			System.out.println("Element is not present in the array list");
		}
		if(hs.contains("Divyank")) {
			System.out.println("Elemet is present in the Hash Set");
		}
		else {
			System.out.println("Element is not present in the Hash Set");
		}
	}

}
