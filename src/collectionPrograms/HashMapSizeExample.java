package collectionPrograms;

import java.util.HashMap;

//Get Size of HashMap Example
public class HashMapSizeExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hs = new HashMap<>();
		
		hs.put(1, "CocaCola");
		hs.put(2, "Pepsi");
		hs.put(3, "Thumbs Up");
		hs.put(4, "Fanta");
		
		System.out.println("Size of the Given HashMap is " + hs.size());
		
	}

}
