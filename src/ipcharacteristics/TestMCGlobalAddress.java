package ipcharacteristics;

import java.net.InetAddress;

public class TestMCGlobalAddress {
	private static void checkMCGlobalAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			if(address.isMCGlobal()) {
				System.out.println(ip + " is MCGlobal address.");
			}
			else {
				System.out.println(ip + " is not MCGlobal address.");
			}
		} 
		else {
			System.out.println(ip + " is not even a multicast address.");
		}
	}
	
	private static void demoMCGlobalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMCGlobalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- MC Global Demo ---------------");
		
		demoMCGlobalAddress("128.0.0.3");
		demoMCGlobalAddress("224.255.255.255"); 
		demoMCGlobalAddress("239.255.255.255"); 
		demoMCGlobalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCGlobalAddress("FF0E:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCGlobalAddress("FF1E:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
