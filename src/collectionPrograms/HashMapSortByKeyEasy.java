package collectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// How to sort map keys in java

public class HashMapSortByKeyEasy {

	/*	1) Create a hashMap
	 *  2) Add elements to hashMap
	 *  3) Create treemap by passing hashmap object created in step1
	 *  4) Print the elements of treemap. 
	 */
	public static void main(String args[]) {
		Map<String,String> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", "apple");
		unsortedMap.put("pineapple", "pineapple");
		unsortedMap.put("banana", "banana");
		unsortedMap.put("guava", "guava");

		for(Map.Entry<String, String> entry: unsortedMap.entrySet()) {
			System.out.println("Unsorted Key Value " + entry.getKey());
		}
		
		Map<String,String> treeMap = new TreeMap<String,String>(unsortedMap);
		for(Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Sorted key value " + entry.getKey());
		}
	}
}
