package BasicPrograms;

public class methodPractice {

	public static void main(String[] args) {
	//	 String name = "neeru";
		 int age = 16;
		 int shoesize = 6;
		 //below values are called arguments
         int abc = divyank(age,shoesize); 
         System.out.println(abc);
	}
	//Below values are called parameters
	public static int divyank(int a,int b) {
		int z = a+b;
		
		System.out.println("Name is " + a);
		System.out.println("Age is " + b);
		return z;
	}

}
