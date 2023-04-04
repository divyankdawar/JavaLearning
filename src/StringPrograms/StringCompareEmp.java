package StringPrograms;
//How to compare two strings ?
public class StringCompareEmp {

	public static void main(String[] args) {
		// Way 1
/*		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));   */
        		
		String s1 = "tutorialpoint";
		String s2 = "tutorialpoint";
		String s3 = new String("tutorialpoint");
		String s4 = "tutorialpoint";
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		

	}

}
