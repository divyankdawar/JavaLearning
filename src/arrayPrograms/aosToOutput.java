package arrayPrograms;
//How to write an array of strings to the output console ?
import java.util.Arrays;

public class aosToOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = new String[3];
		greetings[0] = "This is the greeting";
		greetings[1] = "for all the readers from";
		greetings[2] = "Java Source";

		for(int i =0;i<greetings.length;i++) {
			System.out.println(greetings[i]); 

		}

		String[] arr = new String[] {"Tutorial","Of","Java"};
		System.out.println(Arrays.toString(arr));

	}

}
