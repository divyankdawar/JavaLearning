package arrayPrograms;

public class zzzSecondLargestTough {
// 2nd Largest Element in array by deepak 
	public static void main(String[] args) {
		  int a[] = {8,8,8,8,8,8};
		  int largest = Integer.MIN_VALUE;
		  int second_largest = Integer.MIN_VALUE;
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]>largest) {
				  second_largest = largest;
				  largest = a[i];
			  }
			  else if (a[i]>second_largest && a[i]!=largest) {
				  second_largest=a[i];
			  }
		  }
		  if(second_largest==Integer.MIN_VALUE) {
			  System.out.println("There is no second largest element in the list");
		  }
		  else {
			  System.out.println("Second largest value is " + second_largest);
		  }

	}

}
