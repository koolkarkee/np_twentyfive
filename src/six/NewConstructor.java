package six;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NewConstructor {

	public static void main(String[] args) {
		InetAddress fddi;
		try {
			fddi = InetAddress.getByName("fddisunste.orgoit.unc.edu");
			Socket socket = new Socket("www.orielly.com", 80, fddi, 0);
			System.out.println("connected to oreilly");
			
		} catch (IOException e) {
			System.out.println("not found");
		}	
		

	}

}
