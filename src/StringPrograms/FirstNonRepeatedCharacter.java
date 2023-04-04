package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


//#5: Find First Non Repeated character

public class FirstNonRepeatedCharacter {
	public static void main(String args[]) {
		String str = "programming";

		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		// maintains insertion order...
		int count = 1;
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);
			}
			else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}

		//Printing the first non-repeated character from map

		for(Entry<Character,Integer> entry : map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println("The first non repeated character is : " + entry.getKey());
				break;  
			}
		}
	}
}
