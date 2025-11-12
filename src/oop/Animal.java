package oop;

//parent class
public class Animal {
	//properties : noOfLegs, color, hasTail, sound 
	private int noOfLegs;
	private String color; 
	private boolean hasTail;
	private int sound;
	
	//getter 
	public int getNoOfLegs() {
		return this.noOfLegs;
	}
	
	public int getSound() {
		return this.sound;
	}
	
	//setter 
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	
	
	//constructor 
	public Animal() {
		this.hasTail = true;
	}
	
	//overloaded constructor
	public Animal(int noOfLegs, String color, boolean hasTail, int sound) {
		this.noOfLegs = noOfLegs;
		this.color = color;
		this.hasTail = hasTail;
		this.sound = sound;
	}
	
	//method : makeSound, move
	public void makeSound() {
		System.out.println("The frequency is " + this.sound + " Hz.");
	}
	
}
