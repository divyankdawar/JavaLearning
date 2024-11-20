package StringPrograms;
//How to remove a particular character from a string ?
public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is java";
		System.out.println(removeCharAt(str, 3));

	}
	public static String removeCharAt(String s,int pos) {
		return s.substring(0,pos) + s.substring(pos+1);

		
/**The function str.substring(0,p) will return a substring from 0th position to p-1th position. And str. substring(p+1) will return the string from p+1th position to the end of string. 
  substring method can be used with these two parameter as per your usage.		*/
 

		/*	String str = "This is java";
	String abc = str.replace("This","");
    System.out.println(abc);
		 */
	}	

}
