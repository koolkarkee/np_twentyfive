package twelve.hello;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends MessageImplementation  {
	//default constructor
	public Server() {
		
	}
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
		//instantiating the object
		MessageImplementation remoteObject =  new MessageImplementation();
		
		//exporting the object to the stub
		IMessage stub = (IMessage) UnicastRemoteObject.exportObject(remoteObject, 0);
	
		//binding 
		Registry registry = LocateRegistry.createRegistry(8070);
		registry.bind("IMessage", stub);
		
		System.out.println("Remote Server is ready... ");
	}

}
