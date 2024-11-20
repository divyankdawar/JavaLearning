package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Write a program to convert Array to ArrayList?

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[] = {"New York","Seattle","Virginia"};
//		System.out.println(cities.length);
//		System.out.println("Enter the hashmap value to be searched");
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
				
		ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
		list.add("Leavenworth");
		System.out.println(list.size());

		for(String s : list) {
			System.out.println(s);
		}


	}

}
