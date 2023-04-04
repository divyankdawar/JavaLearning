package collectionPrograms;

import java.util.HashSet;
import java.util.Iterator;

//How To Iterate Through A HashSet/Set

public class HashSetIteratorExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Banana");

		Iterator<String> it = hs.iterator();

		System.out.println("HashSet Contains");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
