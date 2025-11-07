package oop;

public class DigitalBoardDemo {
	public static void showDetails(DigitalBoard d) {
		System.out.println("---------------- Details ------------------");
		System.out.println("Height : \t\t " + d.getHeight() + " ft");
		System.out.println("Width : \t\t " + d.getWidth() + " ft");
		System.out.println("Model Number : \t\t" + d.getModelNumber());
		System.out.println("No of USB Ports : \t " + d.getNumberOfUSBPorts());
		System.out.println("Status : \t\t " + (d.getIsOpened() ? "Opened" : "Closed"));
		System.out.println("Area : \t\t " + d.getArea() + " sq. ft.");
		System.out.println("---------------- ------ ------------------");
	}
	
	public static void main(String[] args) {
		//declare
		DigitalBoard digitalBoard = new DigitalBoard();
		DigitalBoard digitalBoard2 = new DigitalBoard(true);

//		digitalBoard.setHeight(3.2);
//		digitalBoard.setWidth(5.2);
//		digitalBoard.setModelNumber("2025-09-04-LG-Screen");
//		digitalBoard.setNumberOfUSBPorts(4);
//		//System.out.println(digitalBoard);
//		
////		String displayValue = "Hello World, Java Batch";
////		digitalBoard.display(displayValue);
//		digitalBoard.open();
//		showDetails(digitalBoard);
		
//		digitalBoard.display(displayValue);
//		digitalBoard.close();
		
		
	}
}