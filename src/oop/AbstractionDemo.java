package oop;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation, instantiation 
//		Car toyota = new Car();
//		System.out.println(toyota);
//		toyota.showDetails();
		
		Car toyota1 = new Car("2025-09-BrandB2");
		toyota1.showDetails();
		toyota1.start();
		toyota1.drive(3.5);
		toyota1.showDetails();
		toyota1.drive(1.1);
		toyota1.showDetails();
		
		Car c = new Car("2025-10-B3", "");
		c.showDetails();
		c.drive(10);
		c.showDetails();
		c.drive(2.5);
		c.showDetails();
		 
		c.showDetails();
		c.stop();
		c.showDetails();
		
//		Car toyota2 = new Car("2025-10-BrandB3");
//		toyota2.showDetails();
		
//		Car ford = new Car();
//		System.out.println(ford);
		
//		System.out.println("\nThe engine number is : " + toyota.getEngineNo());
//
//		//set the engine no
//		toyota.setEngineNo(2);
//		System.out.println("\nThe engine number is : " + toyota.getEngineNo());
//		
//		System.out.println("\nThe color is : " + toyota.getColor());
//		
//		//set color
//		toyota.setColor("Red");
//		System.out.println("\nThe color is : " + toyota.getColor());
//		
//		toyota.setColor("White");
//		System.out.println("\nThe color is : " + toyota.getColor());


	}

}
