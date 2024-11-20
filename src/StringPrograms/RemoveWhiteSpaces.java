package StringPrograms;

public class RemoveWhiteSpaces {
	
	public static void main(String args[]) {
		String str1 = "This is Divyank";
		
		//Remove all white spaces using regex
		str1 = str1.replaceAll("\\s", "");
		System.out.println("String after removing the white spaces : - " + str1);
		//\\s is a regex that matches any whitespace character (spaces, tabs, line breaks)
	}

}
