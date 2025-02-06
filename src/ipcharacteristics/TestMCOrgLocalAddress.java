package ipcharacteristics;

import java.net.InetAddress;

public class TestMCOrgLocalAddress {
	private static void checkMCOrgLocalAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			if(address.isMCOrgLocal()) {
				System.out.println(ip + " is MCOrg Local address.");
			}
			else {
				System.out.println(ip + " is MCOrg Local address.");
			}
		} 
		else {
			System.out.println(ip + " is not even a multicast address.");
		}
	}
	
	private static void demoMCOrgLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMCOrgLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- MCOrg Local Demo ---------------");
		
		demoMCOrgLocalAddress("128.0.0.3");
		demoMCOrgLocalAddress("224.255.255.255"); 
		demoMCOrgLocalAddress("239.255.255.255"); 
		demoMCOrgLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCOrgLocalAddress("FF08:0000:0000:0000:0005:0600:300c:326b"); 
		demoMCOrgLocalAddress("FF18:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
