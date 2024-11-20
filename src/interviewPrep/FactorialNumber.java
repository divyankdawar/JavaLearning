package interviewPrep;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

//		int no =5, fact = 1;
		int fact = 1;
		for(int i =no;i>=1;i--) {
			fact = fact * i;
		}
		System.out.println("factorial of " + no + " is " + fact);

	}
}
