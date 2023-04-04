package StringPrograms;

//Java Program to determine whether a given string is palindrome
public class PalindromeString {
	public static void main(String args[]) {


		String a = "deed";

		boolean flag = true;

		//convert the given string into lower case
		a = a.toLowerCase();
		//Iterate the string forward and backward, compare one character at a time     
		//till middle of the string is reached    
		for(int i =0;i<a.length()/2;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
				flag = false;
				break;	
			}
		}
		if(flag) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string, is not a palindrome");
		}

	}
}
