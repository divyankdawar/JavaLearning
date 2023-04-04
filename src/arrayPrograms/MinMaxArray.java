package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

//How to search the minimum and the maximum element in an array ?

public class MinMaxArray {
// Tutorial Point way
	public static void main(String[] args) {
		
/*		Integer[] numbers = {8,6,5,2,9,1};
		int min = (int)Collections.min(Arrays.asList(numbers));
		int max = (int)Collections.max(Arrays.asList(numbers));
		
		System.out.println("Min number " + min);
		System.out.println("Max number " + max);	 
		*/
		//Smart programming way
		// To find the minimum value
		int a[] = {4,7,1,9,2};
		int max = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}		
		}
		System.out.println("Maximum Element is " + max);
		
		// To find the Minimum element 
		int a2[] = {54,78,12,90,51};
		int min = a2[0];
		for(int j = 1;j<a2.length;j++) {
			if(a2[j]<min) {
				min = a2[j];
			}
		}
		System.out.println("Minimum Element is " + min);  
	}    
}
