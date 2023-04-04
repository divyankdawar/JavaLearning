package StringPrograms;

//Java Program to replace the spaces of a string with a specific character

public class ReplaceSpace {

	public static void main(String args[]) {


		String string = "My Name is Divyank Dawar";
		char c = '-';
        string = string.replace(' ', c);
        System.out.println("String after replacing space with given character");
        System.out.println(string);
	

	}
}