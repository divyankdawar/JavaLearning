package StringPrograms;

import java.util.HashMap;
import java.util.Map;

//How to find duplicate characters 
public class FindDuplicateCharacters {
	public static void main(String args[]) {
		String str = "pprogramming";
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
		for(Character key : map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key + " : " + map.get(key));
			}
		}

	}
}



/* Alternate Way to solve this program without using character array
String str = "pprogramming";

Map<Character, Integer> map = new HashMap<Character, Integer>();

for(int i = 0; i< str.length(); i++) { 
	char currentChar = str.charAt(i);
	
	if(map.containsKey(currentChar)) {
		map.put(currentChar, map.get(currentChar) + 1);
		
	}
	else { 
		map.put(currentChar, 1);
	}
	
}

for(Character key : map.keySet()) {
   if(map.get(key) > 1) {
	   System.out.println(key + " : " + map.get(key));
*/