package StringPrograms;
// How to print a specific text in the string 
public class InterviewQuesiton1 {
	public static void main(String args[]) {
		String email = "divyankdawar@gmail.com";
//		System.out.println(email.length());
		int index = email.indexOf('@');
		email = email.substring(0,index);
		System.out.println(email);
	}

}
