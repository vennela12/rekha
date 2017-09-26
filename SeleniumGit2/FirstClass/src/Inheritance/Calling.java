package Inheritance;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Bird bird = new Bird();
		Dog dog = new Dog();
		System.out.println();

		animal.sleep();
		animal.eat();

		bird.sleep();
		bird.eat();

		dog.sleep();
		dog.eat();
	}

}
