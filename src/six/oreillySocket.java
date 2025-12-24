package six;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class oreillySocket {

	public static void main(String[] args) {
		InetAddress inetaddress;
		try {
			inetaddress = InetAddress.getByName("www.oreilly.com");
			try {
				Socket socket = new Socket(inetaddress, 80);
				System.out.println("connected to oreilly");
			} catch (IOException e) {
				System.out.println("Exeception"+ e.getMessage());
			}
		} catch (UnknownHostException e) {
			System.out.println("not found");
		}
		
		

	}

}
