package oop;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animal animal = new Animal(4, "Black", true, 400);
		animal.makeSound();
		
		Dog dog = new Dog();
		dog.makeSound();
	}

}
