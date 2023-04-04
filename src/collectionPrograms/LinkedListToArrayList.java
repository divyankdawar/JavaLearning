package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//How To Convert LinkedList To ArrayList In Java
public class LinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Dubai");
		linkedlist.add("United States");
		linkedlist.add("Monaco");

		//Converting LinkedList to ArrayList


		List<String> list = new ArrayList(linkedlist);
		for(String s : list) {
			System.out.println(s);
		}
	}

}
