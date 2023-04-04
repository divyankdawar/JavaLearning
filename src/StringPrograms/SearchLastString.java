package StringPrograms;
//How to search the last position of a substring ?
public class SearchLastString {

	public static void main(String[] args) {
		// First Way
 /*       String strOrig = " world, Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        
        if(lastIndex==-1) {
        	System.out.println("Hello not found");
        }
        else {
        	System.out.println("Last occurrence of Hello is at index " + lastIndex);
        }     */
        
        //Second way 
        String t1 = "Tutorialpoint";
        int index = t1.lastIndexOf("p");
        System.out.println(index);
	}

}
