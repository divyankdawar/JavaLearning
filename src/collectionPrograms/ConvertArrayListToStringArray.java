package collectionPrograms;

import java.util.ArrayList;

public class ConvertArrayListToStringArray {

//Convert ArrayList To String Array In Java With
	
	//Instantiating and initializing ArrayList
	public static void main(String args[]) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Jaipur");

		String citiesname[] = cities.toArray(new String[cities.size()]);
	
		//String citiesname[] = new String[cities.size()];

		//  citiesname = cities.toArray(citiesname);

		for(String Str:citiesname) {
			System.out.println(Str);
		}

	}
}