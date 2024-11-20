package arrayPrograms;

import java.util.Scanner;

//Find Element in an Array
public class SearchElementLinear {
	public static void main(String args[]) {
		int a[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println("Enter the element you want to search");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		for(int i =0;i<a.length;i++) {
			if(a[i]== b) {
				System.out.println("Element found at index " + i);
				break;
			} 
		}

	}

}
