package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

//Find the frequency of element in an array

public class FrequencyArray {

	public static void main(String args[]) {
		int[]  arr ={1,2,4,4,5,5,6,6,7,7,8,8,8};

		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();

		for(int element: arr) {
			if(myMap.containsKey(element)) {
				int newValue = myMap.get(element);
				myMap.put(element, ++newValue);
			}
			else {
				myMap.put(element, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
			System.out.println(entry.getKey()+ "occurs: " + entry.getValue() + "times");
		}
	}
}


