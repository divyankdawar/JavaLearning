package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement2 {

// WAP to find the duplicate elements in an array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,4,5,6,7,3,6,6};
		System.out.println("Duplicate Elements are: -");
		Set<Integer> s = new HashSet<>();
		for(int no: a) {
			
		      //True==False
			if(s.add(no) == false) {
				System.out.println(no + " ");
			}
		}
	}

}


