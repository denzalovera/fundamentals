package fundamentals.oop;

public class Dog {

	/*public Dog() {
		// TODO Auto-generated constructor stub
	}*/
	String Breed;
	int age;
	String color;
	
	void barking() {
		System.out.println("Bark!");
	}
	void hungry() {
		boolean hungry = false;
		System.out.print("Dog is: " + hungry);
	}
	
	void sleeping() {
		boolean sleeping = false;
		System.out.print("Dog is: " + sleeping);
	}
	
	public class Puppy extends Dog {
		double length; 
		
		void bark() {
			System.out.println("Bark!!");
		}
	}


}