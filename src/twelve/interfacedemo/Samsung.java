package twelve.interfacedemo;

public class Samsung implements IPhone {

	@Override
	public void send() {
		System.out.println("Message sending from Samsung ...");
	}

	@Override
	public void receive() {
		System.out.println("Message receiving from Samsung");
	}

}
