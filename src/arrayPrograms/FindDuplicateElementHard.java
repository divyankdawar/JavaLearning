package arrayPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// Find Duplicate Elements in an Array Deepak
public class FindDuplicateElementHard {

	public static void main(String args[]) {
		int[] arr = {3,5,4,3,2,2,1,3};
		Map<Integer,Integer> hm = new HashMap<>();
		for(int no:arr) {
		     Integer count = hm.get(no);
		     if(count==null) {
		    	 	hm.put(no, 1);
		     }
		     else {
		    	 count = count + 1;
		    	 hm.put(no, count);
		     }
		}
//Here Entry Set is a method and Entry is a sub interface of Map we use entry interface when we want to fetch key and value from Map interface 	
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		for(Map.Entry<Integer,Integer> me : es) {
			if(me.getValue()>1) {
				System.out.println(me.getKey()+ " ");
			}
		}
	}
}
