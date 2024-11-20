package interviewPrep;

import java.util.Arrays;

//Find the largest concatenated number from the given array
public class LargestConcatenatedNumber {

	public String largestNumber(String[] arr) {
		StringBuilder stringBuilder = new StringBuilder();

		// Sort array with custom comparator to form the largest number
		Arrays.sort(arr, (String a, String b) -> {
			String ab = a + b;
			String ba = b + a;
			return ab.compareTo(ba) > 0 ? -1 : 1; // Sort in descending order
		});

		// Edge case: If the largest number is "0", then all numbers are zero
		if(arr[0].equals("0")) {
			return "0";

		}

		//Build the final concatenated number
		for(String s:arr) {
			stringBuilder.append(s);
		}
		return stringBuilder.toString();
	}


	//Main Method to test the function
	public static void main(String args[]) {
		String arr[] = {"34","76","56","916"};
		LargestConcatenatedNumber obj = new LargestConcatenatedNumber();
		System.out.println("Largest concatenated number: " + obj.largestNumber(arr));
	}
}



