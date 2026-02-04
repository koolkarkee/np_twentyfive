package ten;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class PacketSendDemo {
	public static void main(String[] args) throws IOException {
		int argc = args.length;
		if(argc != 1) {
			System.out.println("syntax");
			System.out.println("Java packetdemo hostname");
	
		}
		String hostname = args[0];		
		System.out.println("Binding  to the local port");
		
		try {
			DatagramSocket socket = new DatagramSocket();
			System.out.println("Bound to local port :" + socket.getLocalPort());
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			PrintStream pout = new PrintStream(bout);
			
			pout.print("Grettings");
			
			byte[] barray = bout.toByteArray();
			
			DatagramPacket packet = new DatagramPacket(barray, barray.length);
			System.out.println("Looking up hostname" + hostname);
			
			InetAddress remot_addr = InetAddress.getByName(hostname);
			System.out.println("Hostname resolved as" + remot_addr.getHostAddress());
			
			packet.setAddress(remot_addr);			
			packet.setPort(1000);			
			socket.send(packet);
			System.out.println("packet sent"); 			
		} catch (SocketException e) {
			e.printStackTrace();
		}
		}

}
