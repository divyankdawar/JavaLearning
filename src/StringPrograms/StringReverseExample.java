package StringPrograms;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String original1 = sc.next();
//		String original = "DivyankDawar";
		String reverse = new StringBuffer(original1).reverse().toString();
        System.out.println("Original String is " + original1);
        System.out.println("Reversed String is " + reverse);
	}

}

/*
String Input: Note that sc.next() reads the next token, which is a word delimited by whitespace. If you want to read the entire line including spaces, use sc.nextLine() instead.


*/