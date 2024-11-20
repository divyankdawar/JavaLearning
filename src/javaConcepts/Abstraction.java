package javaConcepts;

abstract class Animal1 {

	public abstract void makeSound();

	public void sleep() {
		System.out.println("Sleeping...");

	}
}

class Dog1 extends Animal1 {


	public void makeSound() {
		System.out.println("Bark");

	}

}	

public class Abstraction {
	public static void main(String args[]) {
		Dog1 myDog = new Dog1();
		myDog.makeSound();

}
}
