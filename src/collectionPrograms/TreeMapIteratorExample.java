package collectionPrograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Write a program to iterate TreeMap in java?


public class TreeMapIteratorExample {

	public static void main(String args[]) {

		TreeMap<String,String> treemap = new TreeMap<String,String>();
		treemap.put("Key1", "Pear");
		treemap.put("Key2", "Apple");
		treemap.put("Key3", "Orange");
		treemap.put("Key4", "Papaya");
		treemap.put("Key5", "Banana");

		System.out.println("Treemap Contains");
		for(Map.Entry<String, String> entry : treemap.entrySet()) {

			System.out.println("Key is " + entry.getKey() + "and value is " + entry.getValue());
		}
	}
}



