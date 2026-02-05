package eleven;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MulticastSocketServer {
	final static String INET_ADDR = "224.0.0.3";
	final static int PORT = 8888;
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getByName(INET_ADDR);
		
		try(DatagramSocket serverSocket = new DatagramSocket()) {
			for (int i = 1; i <= 5; i++) {
				String msg = "Sent message no " + i;
				
				DatagramPacket msgPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr,  PORT);
				serverSocket.send(msgPacket);
				
				System.out.println("Server sent packet with msg : " + msg);
				Thread.sleep(500);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
