package two;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceLists {

	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> list = NetworkInterface.getNetworkInterfaces();
			while(list.hasMoreElements()) {
				NetworkInterface element = list.nextElement();
				System.out.println(element);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

}
