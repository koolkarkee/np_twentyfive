package oop;

public class Car {
	//declaration of properties, characteristics, attributes (camel-case convention)
	//engineNo, color 
	private int engineNo;
	private String color; 
	private double distanceTraveled;
	private String modelName;
	private boolean moving;
	
	//default constructor (no return type)
	public Car() {
		//initialization tasks
		System.out.println("\nVROOM VROOM VROOM ...");
		this.distanceTraveled = 0;
		this.moving = false;
//		this.modelName = "2025Bibek03";
	}
	
	//constructor overload 
	public Car(String modelName) {
		this();
		this.modelName = modelName;
	}
	
	//overload the constructor again
	public Car(String modelName, String color) {
		this(modelName);
		this.color = color;
	}
	
	
	//getters and setters 
	public int getEngineNo() {
		return this.engineNo;
	}
	
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//methods, behavior
	//start, stop
	public void start() {
		System.out.println("\nThe car of " + this.modelName + " has started ... ");
	}
	
	public void drive(double distanceTraveled) {
		this.distanceTraveled = this.distanceTraveled + distanceTraveled;
		this.moving = true;
	}

	public void stop() {
		System.out.println("\nThe car of " + this.modelName + " has stopped ... ");
		this.moving = false;
	}
	
	//show details
	public void showDetails() {
		System.out.println("\n---------------- Details -----------------");
		System.out.println("\nModel Name : \t\t " + this.modelName);
		System.out.println("\nEngine Number : \t " + getEngineNo());
		System.out.println("\nColor : \t\t " + getColor());
		System.out.println("\nDistance Travelled : \t " + this.distanceTraveled + " Km");
		System.out.println("\nCar moving? \t\t " + (this.moving ? " Moving" : " Not Moving"));
		System.out.println("\n---------------- ------- -----------------");
	}
}
