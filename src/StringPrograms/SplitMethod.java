package StringPrograms;
// How to use split method in string
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "t u t o r i a l s";
       //String[] is an java array of String objects
       String[] words = s1.split("\\s");
       for(String w:words) {
    	   System.out.println(w);
       }
	}

}
