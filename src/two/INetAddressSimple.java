package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetAddressSimple {
	
	public static void printIPAddress(String host) {
		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println(address);
		} 
		catch(UnknownHostException ex) {
			System.out.println("Unknown Host Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void printHost(String ipAddress) {
		try {
			InetAddress inetAddress = InetAddress.getByName(ipAddress);
			System.out.println(inetAddress.getHostName());
			System.out.println("hello world");
			System.out.println(inetAddress.getCanonicalHostName());
			//System.out.println(address.getHostAddress());
		} 
		catch(UnknownHostException ex) {
			System.out.println("Unknown Host Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
//		String facebook = "www.facebook.com";		
//		printIPAddress(facebook);
//		
//		String localhost = "localhost";
//		printIPAddress(localhost);
//		
//		String unknownwebsite = "adfasdfasdfas.com";
//		printIPAddress(unknownwebsite);
		
		String myIpLocal = "104.21.79.8";
		printIPAddress(myIpLocal);
	}

}
