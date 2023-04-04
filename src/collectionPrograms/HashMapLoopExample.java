package collectionPrograms;

import java.util.HashMap;

//Iterating or looping Map Using keySet() and foreach loop

public class HashMapLoopExample {

	public static void main(String[] args) {
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("Key1", "Value1");
		hashmap.put("Key2", "Value2");
		System.out.println("Iterating or looping map using for each loop");

		//Iterating or looping using keySet() method

		for(String key:hashmap.keySet()) {
			System.out.println("key: " + key + "value: " + hashmap.get(key));
		}
	}

}
