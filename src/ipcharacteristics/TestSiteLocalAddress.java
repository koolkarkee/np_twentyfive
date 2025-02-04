package ipcharacteristics;

import java.net.InetAddress;

public class TestSiteLocalAddress {
	private static void checkSiteLocalAddress(InetAddress address, String ip) {
		if(address.isSiteLocalAddress()) {
			System.out.println(ip + " is a site local address.");
		}
		else {
			System.out.println(ip + " is not a site local address.");
		}
	}
	
	private static void demoSiteLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkSiteLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- Site Local Address Demo ---------------");
		
		demoSiteLocalAddress("127.0.0.1");
		demoSiteLocalAddress("128.0.0.1");
		
		demoSiteLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b");
		demoSiteLocalAddress("FEC0:0000:0000:0000:0005:0600:300c:326b");
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
