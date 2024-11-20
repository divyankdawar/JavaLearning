package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

// Write a program to sort ArrayList in descending order
public class ArrayListDescendingSort {
	public static void main(String args[]) {

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Banana");
		arrList.add("Pear");
		arrList.add("Mango");

		/*Unsorted List: ArrayList content before sorting*/
		System.out.println("ArrayList Before Sorting:");
		for(String s : arrList) {
			System.out.println(s);
		}
		/* Sorting in decreasing (descending) order*/
		Collections.sort(arrList,Collections.reverseOrder());

		/* Sorted List in reverse order*/
		System.out.println("ArrayList in descending order:");
		for(String str : arrList) {
			System.out.println(str);
		}
	}
}

/*
The line Collections.sort(arrList, Collections.reverseOrder()); does the following:

Collections: Accesses the utility class that contains static methods for collections.
sort: Calls the sort method to sort the list.
arrList: The list you want to sort.
Collections.reverseOrder(): Passes a comparator to the sort method that sorts the list in reverse (descending) order

*/
