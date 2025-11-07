package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressGetterMethodsDemo {

	public static void main(String[] args) {
		//InetAddress => IP working class 
		try {
			//factory method instantiation
			//InetAddress address = InetAddress.getByName("www.google.com");
			//System.out.println(address);

			InetAddress address2 = InetAddress.getByName("104.21.79.8");
			System.out.println(address2.getHostName());//			InetAddress facebook = InetAddress.getByName("www.facebook.com");
//			System.out.println(facebook);
//			
//			InetAddress ishwor = InetAddress.getByName("www.ishwordulal.com.np");
//			System.out.println(ishwor);
//			
//			InetAddress address2 = InetAddress.getByName("localhost");
//			System.out.println(address2);
//			
//			InetAddress nirwana = InetAddress.getByName("www.nirwanashrestha.com.np");
//			System.out.println(nirwana);
		} catch (UnknownHostException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
