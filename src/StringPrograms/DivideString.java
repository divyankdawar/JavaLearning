package StringPrograms;


// Java Program to divide a string in 'N' equal parts.
public class DivideString {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		int len = str.length();
		String a =str.substring(0, 3);
		System.out.println(str.length());
		//dividing the string into n equal parts
		int n=3;
		int temp =0, chars = len/n;
		String equalStr[] = new String[n];

		//Check whether a string can be divided into n equal parts
		if(len%n !=0) {
			System.out.println("Sorry this string cannot be divided into " + n + "equal parts");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String part = str.substring(i,i+chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println("length of the array :" + equalStr.length);
			System.out.println(n + " Equal parts of string are");
			for(int i=0;i<equalStr.length;i++) {
				System.out.println(equalStr[i]);
			}
		}


	}

}
