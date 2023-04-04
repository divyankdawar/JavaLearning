package BasicPrograms;

public class ToString {

	public static void main(String args[]) {


		// toString() = special method that all objects inherit,
		//              that returns a string that "textually represents" an object.
		//              can be used both implicitly and explicitly
		Car car = new Car();

		//Explicitly
		System.out.println(car.toString());

		//Implicitly
		System.out.println(car);
	}
}

class Car{
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;

	@Override
	public String toString() {

		return make + "\n" + model + "\n" + color + "\n" + year;
	}
} 


