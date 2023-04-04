package collectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Program for Sorting HashMap by Keys
public class HashMapSortByKeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashmap = new HashMap<>();

		//Adding key and value pair to hashmap
		hashmap.put(22, "A");
		hashmap.put(10, "B");
		hashmap.put(33, "Z");
		hashmap.put(99, "I");	

		System.out.println("Before Sorting");
		//entrySet() = It is used to create and then return a 'set' of the same elements that are already present in the HashMap
		Set set = hashmap.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + 	":");
			System.out.println(pair.getValue());
		}

		Map<Integer,String> map = new TreeMap<Integer,String>(hashmap);
		System.out.println("After sorting");
		Set set2 = map.entrySet();
		Iterator it2 = set2.iterator();
        
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it2.next();
			System.out.println(pair.getKey()+ ":");
			System.out.println(pair.getValue());
		}
	}
}
