package twelve.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

//declaring remote  interface 
public interface IMessage extends Remote {
	//method declaration (definition) but not implementation
	void sayHello() throws RemoteException;
	String saySomething() throws RemoteException;
}
