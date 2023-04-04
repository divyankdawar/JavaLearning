package collectionPrograms;

import java.util.HashMap;
import java.util.HashSet;

//Write a program to add elements to the HashMap given the key and value data type is String

public class AddElementsToHashMap {
	public static void main(String args[]) {

		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		//	HashSet<Integer> al = new HashSet<Integer>();

		hashmap.put(1, "Divyank is successful");
		hashmap.put(2, "Divyank owns a Luxury car");
		hashmap.put(3, "Divyank owns Mercedes MayBach");	

		System.out.println(hashmap);


		}
	}
