package ipcharacteristics;

import java.net.InetAddress;

public class TestMCNodeLocalAddress {
	private static void checkMCNodeLocalAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			if(address.isMCNodeLocal()) {
				System.out.println(ip + " is MCNode Local address.");
			}
			else {
				System.out.println(ip + " is MCNode Local address.");
			}
		} 
		else {
			System.out.println(ip + " is not even a multicast address.");
		}
	}
	
	private static void demoMCNodeLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMCNodeLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- MCLink Local Demo ---------------");
		
		demoMCNodeLocalAddress("128.0.0.3");
		demoMCNodeLocalAddress("224.255.255.255"); 
		demoMCNodeLocalAddress("239.255.255.255"); 
		demoMCNodeLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCNodeLocalAddress("FF08:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCNodeLocalAddress("FF18:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCNodeLocalAddress("FF05:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCNodeLocalAddress("FF15:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCNodeLocalAddress("FF02:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCNodeLocalAddress("FF12:0000:0000:0000:0005:0600:300c:326b"); 
		
		demoMCNodeLocalAddress("FF01:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCNodeLocalAddress("FF11:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
