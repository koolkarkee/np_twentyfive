package six;

import java.net.InetAddress;
import java.net.Socket;

public class SocketGetLocalAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String hostname = "java.sun.com";
			Socket theSocket = new  Socket(hostname, 80);
			InetAddress localAddress = theSocket.getLocalAddress();
			System.out.println("Connecting from local address" + localAddress);
			
			int localPort = theSocket.getLocalPort();
			System.out.println("connecting to local port "+ localPort);
		} catch ( Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
