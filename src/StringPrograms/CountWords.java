package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		String str = "I am am learning java programming";
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
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
