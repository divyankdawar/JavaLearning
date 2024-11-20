package interviewPrep;

public class LeapYear {
	public static void main(String args[]) {
		int year = 2017;
		if((year%400==0) || (year%4 ==0 && year%100!=0)) {
			System.out.println("This Year is Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
	

	}

}
