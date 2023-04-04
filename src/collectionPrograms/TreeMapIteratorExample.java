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

		//Get set of entries
		Set set = treemap.entrySet();

		//Get iterator
		Iterator it = set.iterator();

		//Show TreeMap elements
		System.out.println("Treemap Contains");
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
		
			System.out.println("Key is : " + pair.getKey() + "and");
			System.out.println("Value is: " + pair.getValue());
		}
	}


}
