package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		String str = "I am am learning java programming";
		Map<String, Integer> map = new HashMap<String, Integer>();
//		Integer count = 1;
		String[] arr = str.split(" ");
		//System.out.println(arr);
		for (String word : arr) {
			if(map.containsKey(word))
				map.put(word,map.get(word)+1);
			
			
			else
				map.put(word,1);
		}

		System.out.println(map);
	}

}
/*Chat GPT Example 
 * map.containsKey("am") returns true
map.put("am", map.get("am") + 1) results in map.put("am", 2)

map.containsKey("I") returns false
map.put("I", 1) results in map = {"I": 1}
 */