package seven;

import java.io.IOException;
import java.net.ServerSocket;

public class RandomPort {

	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(0);
			System.out.println("This server runs on Port Number : " + sock.getLocalPort());
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
	}

}
