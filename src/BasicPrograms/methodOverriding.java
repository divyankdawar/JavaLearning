package BasicPrograms;
class Animal {
	void speak() {
		System.out.println("The Animal Speaks");
	}
}
class Dogs extends Animal {

}
public class methodOverriding {
	public static void main(String args[]) {

		// Method overriding = Declaring a method in sub class, 
		//                     which is already present in parent class 
		//                     done so that a child class can give its own implementation
		Dogs dog = new Dogs();
		dog.speak();


	}
}


