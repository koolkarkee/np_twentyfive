package oop;

public class Dog extends Animal {
	//what next? 
	//overriding
	//method : makeSound, move
	public void makeSound() {
		System.out.println("The frequency is " + super.getSound() + " Hz.");
		System.out.println("Bark Bark!");
	}
}
