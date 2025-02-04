package ipcharacteristics;

import java.net.InetAddress;

public class TestMulticastAddress {
	private static void checkMulticastAddress(InetAddress address, String ip) {
		if(address.isMulticastAddress()) {
			System.out.println(ip + " is a multicast address.");
		}
		else {
			System.out.println(ip + " is not a multicast address.");
		}
	}
	
	private static void demoMulticastAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkMulticastAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- Site Local Address Demo ---------------");
		
		demoMulticastAddress("127.0.0.1");
		demoMulticastAddress("128.0.0.1");
		
		demoMulticastAddress("FE80:0000:0000:0000:0005:0600:300c:326b");
		demoMulticastAddress("FEC0:0000:0000:0000:0005:0600:300c:326b");
		
		demoMulticastAddress("224.0.0.0");
		demoMulticastAddress("239.255.255.255");
		
		demoMulticastAddress("223.0.0.0");
		demoMulticastAddress("240.255.255.255"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
