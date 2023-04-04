package BasicPrograms;

public class methodOverloading {
	
	public static void main(String args[]) {
		int a = firstMethod(4,5,5,5);
		System.out.println(a);
	}
	public static int firstMethod(int a,int b) {
		System.out.println("First method value");
		return a+b;
	}
	public static int firstMethod(int c,int d,int e) {
		System.out.println("Second method value");
		return c +d+e;
	}
	public static int firstMethod(int c,int d,int e,int f) {
		System.out.println("Third method value");
		return c +d+e+f;
	}
	
	
	

}
