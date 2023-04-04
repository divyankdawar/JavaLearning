package collectionPrograms;

import java.util.ArrayList;

// Add array list elements at specified index

public class AddArrayListSpeIndex {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("banana");
		al.add("Grapes");

		// below line is adding element at index 2
		al.add(2,"Guava");
		al.remove(2);
		int a = al.size();
		System.out.println(a);
		System.out.println(al);
	}
}