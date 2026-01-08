package twelve.interfacedemo;

public class PhoneDemo {
	public static void showDemo(IPhone phone) {
		//IPhone phone = new Samsung();
		phone.send();
		phone.receive();
	}

	public static void main(String[] args) {
		IPhone phone = new Samsung();
		//IPhone phone = new Huwaeii();
		
		showDemo(phone);		
	}

}
