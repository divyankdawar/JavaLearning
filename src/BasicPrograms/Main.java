package BasicPrograms;

public class Main {

	public static void main(String[] args) {
		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman",42,"BatMobil");
		Hero hero2 = new Hero("Spiderman",32,"Web");
		
		System.out.println(hero2.toString());
	}
}
	class Hero extends Person {
		String power;
		
		Hero(String name,int age,String power){
			super(name,age);
			this.power = power;
			
		}
		
		public String toString() {
			return super.toString() + this.power;
		}

	}


