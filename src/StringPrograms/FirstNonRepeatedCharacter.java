package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	public static void main(String args[]) {
		String str = "pprroommiiomal";
		char arr[] = str.toCharArray();	
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;


		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);	
			}
			else {
				map.put(arr[i],count);
			}
		}
		//keyset() :-  to create a set out of the key elements contained in the hash map
		//Printing Duplicates
		for(Entry<Character,Integer> entry : map.entrySet()) {

			if(entry.getValue()==1) {
				System.out.println("The first non repeated character is : " + entry.getKey());
				break;  
			}
		}
	}
}
/*
 * Purpose of entrySet()
The entrySet() method is useful when you need to access both keys and values of a map simultaneously. It provides a way to iterate through the map entries and perform operations on both keys and values.
 * 
 * 
 * 
 */

