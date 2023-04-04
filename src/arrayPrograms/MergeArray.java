package arrayPrograms;

//Merger two arrays by Smart Programming (Deepak)
public class MergeArray {
         public static void main(String args[]) {
        	 int a[] = {10,20,44,67};
        	 int b[] = {66,77,32,54};
        	 int alength = a.length;
        	 int blength = b.length;
        	 int clength = alength+blength;
        	 
        	 // The Square bracket where clength is written describes the length of the c array
        	 int c[] = new int[clength];
        	 for(int i=0;i<alength;i++) {
        		 c[i] = a[i];
        	 }
        	 for(int i =0;i<blength;i++) {
        		 c[a.length+i] = b[i]; 	 
        	 }
        	 for(int i=0;i<clength;i++) {
        		 System.out.print(c[i] + " ");
        	 }
        	 
         }

}
