package StringPrograms;

public class StringReplaceEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World Hello World";
		System.out.println(str);
//		System.out.println(str.replace('H','W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));

		

	}

}
