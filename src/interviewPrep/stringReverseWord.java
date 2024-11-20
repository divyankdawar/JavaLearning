package interviewPrep;

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
