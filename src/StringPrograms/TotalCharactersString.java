package StringPrograms;

// How to give total Characters in a String 
public class TotalCharactersString {

	public static void main(String[] args) {
		String name = "Divyank Dawar";
		int count = 0;

		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') 
				count ++;	
		}
		
		System.out.println("Total number of characters in string " + count);
	}
}
