package six;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner {

	public static void main(String[] args) {
	String host = "localhost";
	int myPort = 100;
	try {
		Socket socket = new Socket(host, myPort);
		System.out.println("There is a server in a port" + myPort + "of " + host);
	}
	catch (UnknownHostException e) {
		System.err.println(e);
		
	} 
	catch (IOException e) {
		System.out.println("Port not found");
	}
	

	}

}
