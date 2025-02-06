package ipcharacteristics;

import java.net.InetAddress;

public class TestMCSiteLocalAddress {
	private static void checkMCSiteLocalAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			if(address.isMCOrgLocal()) {
				System.out.println(ip + " is MCSite Local address.");
			}
			else {
				System.out.println(ip + " is MCSite Local address.");
			}
		} 
		else {
			System.out.println(ip + " is not even a multicast address.");
		}
	}
	
	private static void demoMCSiteLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMCSiteLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- MCSite Local Demo ---------------");
		
		demoMCSiteLocalAddress("128.0.0.3");
		demoMCSiteLocalAddress("224.255.255.255"); 
		demoMCSiteLocalAddress("239.255.255.255"); 
		demoMCSiteLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCSiteLocalAddress("FF08:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCSiteLocalAddress("FF18:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCSiteLocalAddress("FF05:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCSiteLocalAddress("FF15:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
