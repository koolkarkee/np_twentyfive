package twelve.hello;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		//getting the registry
		Registry registry = LocateRegistry.getRegistry("localhost", 8090);
		
		//look up the registry
		IMessage stub = (IMessage) registry.lookup("IMessage");

		//calling the remote method
		stub.sayHello();
		String s = stub.saySomething();
		System.out.println(s);
		
		System.out.println("Remote method invoked");
	}

}
