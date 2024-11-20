package javaConcepts;



interface Flyable {
	void fly();
}

interface Swimmable {
	void swim();
}

class Duck implements Flyable, Swimmable {
	public void fly() {
		System.out.println("Duck Flying");
	}
	public void swim() {
		System.out.println("Duck Swimming");
	}
	
}

public class Interface {
	public static void main(String args[]) {
		Duck myDuck = new Duck();
		myDuck.fly();
		myDuck.swim();
	}
	
	

}
