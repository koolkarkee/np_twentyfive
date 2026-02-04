package ten;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PacketRecieveDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Binding to local port 1000\n");
			DatagramSocket socket = new DatagramSocket(1000);
			System.out.println("Bound to local port"+ socket.getLocalPort());
			  
			DatagramPacket packet = new DatagramPacket(new byte[256], 256);
			
			socket.receive(packet);
			System.out.println("Packet received!");
			
			InetAddress remoteAddr = packet.getAddress();
			System.out.println("Sent by: "+remoteAddr.getHostAddress());
			System.out.println("Sent from"+ packet.getPort());
			
			ByteArrayInputStream bin = new ByteArrayInputStream(packet.getData());
			
			for(int i=0; i< packet.getLength(); i++) {
				int data =bin.read();
				if(data == -1)
					break;
				else
					System.out.println((char)data);
			}
			socket.close();	  
		}catch(IOException ioe) {
			System.err.println("Error: "+ioe);
		}
	}
}
