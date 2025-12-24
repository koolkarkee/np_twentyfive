package six;

import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClientWithOptions {

	public static void main(String[] args) {
		
		try(Socket socket = new Socket("localhost", 5344)) {
			//set socket option (how we do it)
			socket.setTcpNoDelay(true);
			
			System.out.println(">>connected to server .. .");
			DataOutputStream d = new DataOutputStream(socket.getOutputStream());
			d.writeUTF("Hello, I'm Bibek Karki from client side");
			d.flush();
			d.close();
			
			if(socket.getTcpNoDelay()) {
				socket.setTcpNoDelay(false);
			}
			//socket.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
