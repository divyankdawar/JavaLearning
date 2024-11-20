package BasicPrograms;

//Define an interface with a default method
interface Animals {
 void makeSound();

 //We can also use static here
  default void eat() {
     System.out.println("Animal eats something");
 }
}

//Create a class that implements the interface
class Dog implements Animals {
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     Animals dog = new Dog();
     

     dog.makeSound();
     dog.eat(); // Calls the default eat() method from the interface
 }
}

