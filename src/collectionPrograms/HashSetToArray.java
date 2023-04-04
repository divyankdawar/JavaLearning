package collectionPrograms;

import java.util.HashSet;

//Program to Convert HashSet to Array in Java
public class HashSetToArray {

	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();

		//Adding elements to HashSet object
		hashset.add("Doctor");
		hashset.add("Engineer");

		System.out.println("Elements in hashset are" + hashset);

		//Creating an Array of HashSet size
		String array[]= new String[hashset.size()];

		//Converting HashSet to Array using toArray() method

		hashset.toArray(array);

		//Printing array elements
		System.out.print("Array contains : - ");
		for(String a : array) {
			System.out.print(a + " ");
		}


	}

}
