package arrayPrograms;
// Find Odd and Even Number in an Array
import java.util.ArrayList;

public class OddEvenArray {
	public static void main(String args[]) {
		int a[] = {6,5,4,3,2,1};
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for ( int i =0;i<a.length;i++) {
			// For Even Numbers
			if(a[i]%2==0) {
				al1.add(a[i]);
			}
			//For odd Numbers
			else {
				al2.add(a[i]);
			}
		}
		int temp1 = 0;
		System.out.println("Even numbers are");
		for( int no:al1) {
			temp1 = temp1 + no;
			System.out.print(no + " ");
		}
		System.out.println("\n");
		System.out.println("Total Number of Even numbers are: " + al1.size());
		System.out.println("Sum of all Even numbers are " + temp1);
		int temp2 = 0;
		System.out.println("Odd numbers are");
		for(int no : al2) {
			temp2 = temp2 + no;
			System.out.print(no + " ");
		}
		System.out.println("\n Total no of odd numbers are: " + al2.size());
		System.out.println("Sum of all Odd numbers are " + temp2);
	}

}
