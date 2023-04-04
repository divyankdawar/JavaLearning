package BasicPrograms;

public class Humanconstructor {
	public static void main(String args[]) {

		//constructor = special method that is called when an object is instantiated (created)
		//Constructors allow us to construct objects that have varying attributes (it allows us to create different objects with different values)

		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Daniel",34,86);
		human2.eat();
		human1.drink();

	}

}
class Human {
	String name;
	int age;
	int weight;
	Human(String name,int age,int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;



	}
	void drink() {
		System.out.println(this.name + " is Drinking Coke Cola");
	}
	void eat() {
		System.out.println(this.name + " is Eating Pizza");
	}


}