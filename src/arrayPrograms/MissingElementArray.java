package arrayPrograms;

//Find the Missing element in an Array
public class MissingElementArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,6};
		int expectedelements = a.length+1;
		int total_sum = expectedelements*(expectedelements+1)/2;
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println("Missing Number is " + (total_sum-sum));
	}
}
