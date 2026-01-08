package twelve.hello;

import java.rmi.RemoteException;

//implementation class
public class MessageImplementation implements IMessage {
	
	@Override
	public void sayHello() throws RemoteException {
		System.out.println("Hello from RMI.");
	}

	@Override
	public String saySomething() {
		return "Hello from RMI say something";
	}
}
