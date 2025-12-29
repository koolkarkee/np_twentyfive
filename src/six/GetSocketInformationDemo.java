package six;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class GetSocketInformationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("java.sun.com",80);
			
			InetAddress host = s.getInetAddress();
			System.out.println("Connected to remote host : " + host);
			
			int port = s.getPort();
			System.out.println("Port is " + port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
