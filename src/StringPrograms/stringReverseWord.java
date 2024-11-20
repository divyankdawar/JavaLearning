package StringPrograms;

public class stringReverseWord {


	public static void main(String[] args) {
		String input = "My Name is Divyank";
		String[] words = input.split(" "); // Split the string into words

		// Reverse each individual word and join them back
		StringBuilder reversedString = new StringBuilder();
		for (String word : words) {
			reversedString.append(new StringBuilder(word).reverse()).append(" ");
		}

		String result = reversedString.toString().trim(); // Remove trailing space
		System.out.println(result);
	}
}

//In Java, it's also possible to create an object without assigning it to a variable by calling methods directly on the new instance, all in one line.
//Because this object is only being used once (just to reverse word), we don’t need to store it in a variable.
//word is argument to the StringBuilder Constructor.
//reversedString: This is the variable name, and it acts as a reference (or pointer) to the actual StringBuilder object in memory.
//The object itself doesn’t have a name in Java; only the variable reversedString acts as an identifier to access it.