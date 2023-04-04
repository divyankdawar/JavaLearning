package arrayPrograms;

/* In this program in the first iteration the large element will come at 1st Position
 *  for eg : - 6,8,2,4,3,1,5,7 > 8,6,2,4,3,1,5,7 > 8,7,6,2,4,3,1,5,7
 */
public class SecondLargestEasy {

	public static void main(String args[]) {
		int[] a = {6,8,2,4,3,1,5,7};
		int temp;
		for(int i = 0; i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;					
				}				
			}			
		}
		
		System.out.println("second largest element is " + a[1]);
	}
}
