package two;

import java.net.NetworkInterface;
import java.net.SocketException;

public class NetworkInterfaceGetByName {

	public static void main(String[] args) {
		try {
			NetworkInterface ni = NetworkInterface.getByName("ethernet_0");
			System.out.println(ni);
			
			NetworkInterface ni2 = NetworkInterface.getByIndex(1);
			System.out.println(ni2);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
