package StringPrograms;

public class PalindromeStringEasy {

	public static void main(String args[]) {
		String original = "mam";
		String reverse = "";

		for(int i = original.length()-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);

		}
		if(original.equals(reverse)) {
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}
}
