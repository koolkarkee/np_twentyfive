package ipcharacteristics;

import java.net.InetAddress;

public class TestMCLinkLocalAddress {
	private static void checkMCLinkLocalAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			if(address.isMCLinkLocal()) {
				System.out.println(ip + " is MCLink Local address.");
			}
			else {
				System.out.println(ip + " is MCLink Local address.");
			}
		} 
		else {
			System.out.println(ip + " is not even a multicast address.");
		}
	}
	
	private static void demoMCLinkLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMCLinkLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- MCLink Local Demo ---------------");
		
		demoMCLinkLocalAddress("128.0.0.3");
		demoMCLinkLocalAddress("224.255.255.255"); 
		demoMCLinkLocalAddress("239.255.255.255"); 
		demoMCLinkLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCLinkLocalAddress("FF08:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCLinkLocalAddress("FF18:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCLinkLocalAddress("FF05:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCLinkLocalAddress("FF15:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCLinkLocalAddress("FF02:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCLinkLocalAddress("FF12:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
