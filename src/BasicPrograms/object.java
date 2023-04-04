package BasicPrograms;

public class object {
	// Object = an instance of a class that may contain attributes(characteristics) and methods(Actions)
	// example: (phone,desk,computer,coffee cup)

	public static void main(String args[]) {
         Car a = new Car();
      //   a.brake();
         a.drive();
         
	}
	public static class Car {
       String make = "Chevrolet";
       String model = "Corvette";
       int year =2020;
       String color = "blue";
       double price = 50000.00;
       
       void drive() {
    	   System.out.println("You drive the Car");
       }
       
       void brake() {
    	   System.out.println("You step on the brakes");
       }

	}	



}


