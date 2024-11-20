package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

// Count Each character appearing how many times

public class AllCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Divyank Dawar";
		Map<Character, Integer> myMap = new LinkedHashMap<>();
		
		for(char c: str.toCharArray()) {
			if(myMap.containsKey(c)) {
				myMap.put(c, myMap.get(c)+1);
			}
			else {
				myMap.put(c, 1);
			}
		}
         
		// Print the character frequencies
		for(Map.Entry<Character,Integer> entry : myMap.entrySet()) {
			System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
		}
	}

}
