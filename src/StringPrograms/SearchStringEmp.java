package StringPrograms;
//How to search a word inside a string ?
public class SearchStringEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String strOriginal = "Coders Hello";
		int intIndex = strOriginal.indexOf("Hello");
		if(intIndex == -1) {
			System.out.println("Empty String");
		}
		else {
			System.out.println("Hello is at index " + intIndex); 
		}  */

		// Method 2 that returns t
		String text = "The cat is on the table";
		System.out.println(text.contains("cat"));
	}

}
