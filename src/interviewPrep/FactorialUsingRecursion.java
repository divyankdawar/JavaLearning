package interviewPrep;

class FactorialUsingRecursion {

	static int fact =1;
	public static void main(String args[]) {
		int no =5;
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		f.calculateFact(no);
		System.out.println("factorial of " +no + " is "+ fact );
	}
	void calculateFact(int no) {
		if(no>=1) {
			fact =fact*no;
			calculateFact(no-1);
		}

	}
}