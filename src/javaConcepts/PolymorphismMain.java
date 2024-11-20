package javaConcepts;

  class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Superclass reference to a subclass object
        myDog.makeSound();  // Outputs: Dog barks

        Animal myCat = new Cat();  // Another subclass object
        myCat.makeSound();  // Outputs: Cat meows

        // myDog.fetch();  // Error: cannot find symbol method fetch()

        Dog realDog = new Dog();  // Subclass reference to a subclass object
        realDog.fetch();  // Outputs: Dog fetches the ball
    }
}
