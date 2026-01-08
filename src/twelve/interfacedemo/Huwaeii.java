package twelve.interfacedemo;

public class Huwaeii implements IPhone {

	@Override
	public void send() {
		System.out.println("Message sending from Huwaeii");
	}

	@Override
	public void receive() {
		System.out.println("Message receiving from Huwaeii");
	}

}
