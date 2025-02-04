package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetterMethodDemo {

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
			System.out.println(inetAddress.getCanonicalHostName());
			System.out.println(inetAddress.getHostAddress());			
			System.out.println(inetAddress.getAddress());			
		} 
		catch(UnknownHostException ex) {
			System.out.println("Unknown Host Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		String facebook = "www.facebook.com";		
		printIPAddress(facebook);
		
		String ipAddress = "163.70.145.35";
		printHost(ipAddress);
	}

}
