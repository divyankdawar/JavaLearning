package arrayPrograms;

import java.util.Scanner;

public class LeftRotateArray {
	public static void main(String args[]) {


		int myArray[] = new int[] {1,2,3,4,5};
		int outputArray[] = new int[myArray.length];
		System.out.println("Please enter number of rotations");
		Scanner sc = new Scanner(System.in);
		int noOfRotations = sc.nextInt();
		int rotatingPoint = noOfRotations;

		int i =0;
		while(rotatingPoint<myArray.length) {
			outputArray[i] = myArray[rotatingPoint];
			i++;
			rotatingPoint++;
		}
		rotatingPoint = 0;
		while(rotatingPoint<noOfRotations) {
			outputArray[i] = myArray[rotatingPoint];
			i++;
			rotatingPoint++;
		}
		System.out.println("Output array is : ");
		for(int arrayElement : outputArray) {
			System.out.print(arrayElement + " ");
		}
	}
}