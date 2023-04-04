package BasicPrograms;

public class ArrayofObjects {

	public static void main(String[] args) {
		Food food1 = new Food("Pizza");
		Food food2 = new Food("HamBurger");
		Food food3 = new Food("Chicken");

		Food[] refrigerator = {food1,food2,food3};
		System.out.println(food1.name);
	}	   

}



class Food {
	String name;
	Food(String name) {
		this.name = name;

	}
}