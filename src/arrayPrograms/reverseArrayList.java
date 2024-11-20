package arrayPrograms;
//How to reverse an array list ?
//Following example reverses an array list by using Collections.reverse(ArrayList)method.
import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Divyank");
		ar.add("Rahul");
		ar.add("Sahil");
		ar.add("Piyush");
		Collections.reverse(ar);
		System.out.println(ar);

	}

}
