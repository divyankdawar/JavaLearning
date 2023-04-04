package StringPrograms;

public class CountCharacter {

	//How to count occurence in a Given String
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is aa test string";
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a') {
				count ++;
			}
		}
		System.out.println(count);
	}
}
