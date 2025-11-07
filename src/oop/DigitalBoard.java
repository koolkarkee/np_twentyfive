package oop;

public class DigitalBoard {
	//properties => characteristics, attributes 
	private double height;
	private double width;
	private String modelNumber;
	private int numberOfUSBPorts;
	private boolean isOpened;
	private int numberOfLANPorts;
	
	//constructor => no return type, and goes with same class name, and is public 
	//default constructor 
	public DigitalBoard() {
		System.out.println("Welcome to digital board ... ");
	}
	
	//constructor overloading => overloaded constructor 
	public DigitalBoard(boolean isOpened) {
		//do what default constructor does 
		this();
		this.isOpened = isOpened;
	}
	
	public DigitalBoard(boolean isOpened, int numberOfLANPorts) {
		this(isOpened);
		this.numberOfLANPorts = numberOfLANPorts;
	}
	
	//getters and setters (method)
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getModelNumber() {
		return this.modelNumber;
	}
	
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public int getNumberOfUSBPorts() {
		return this.numberOfUSBPorts;
	}
	
	public void setNumberOfUSBPorts(int numberOfUSBPorts) {
		this.numberOfUSBPorts = numberOfUSBPorts;
	}
	
	public boolean getIsOpened() {
		return this.isOpened;
	}
	
	public int getNumberOfLANPorts() {
		return this.numberOfLANPorts;
	}
	
	//methods => behavior or class functions 
	//open, close, display 
	public void open() {
		this.isOpened = true;
		System.out.println("Digital Board is open now ... ");
	}
	
	public void close() {
		this.isOpened = false;
		System.out.println("Digital Board is closed now ... ");
	}
	
	public void display(String s) {
		if(this.isOpened == true) {			
			System.out.println(s);
		}
	}	
	
	public double getArea() {
		return this.height * this.width;
	}
}
