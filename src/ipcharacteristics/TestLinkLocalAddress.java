package ipcharacteristics;

import java.net.InetAddress;

public class TestLinkLocalAddress {
	private static void checkLinkLocalAddress(InetAddress address, String ip) {
		if(address.isLinkLocalAddress()) {
			System.out.println(ip + " is link local address.");
		}
		else {
			System.out.println(ip + " is not link local address.");
		}
	}
	
	private static void demoLinkLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkLinkLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- Link Local Demo ---------------");
		
		demoLinkLocalAddress("80.80.80.80");
		demoLinkLocalAddress("127.0.0.3");
		demoLinkLocalAddress("127.0.0.1");
		demoLinkLocalAddress("1050:0000:0000:0000:0005:0600:300c:326b");
		demoLinkLocalAddress("FE80:0000:0000:0000:0005:0600:300c:326b"); 
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
