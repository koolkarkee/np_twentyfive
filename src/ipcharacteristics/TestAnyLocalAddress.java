package ipcharacteristics;

import java.net.InetAddress;

public class TestAnyLocalAddress {
	private static void checkAnyLocalAddress(InetAddress address, String ip) {
		if(address.isLoopbackAddress()) {
			System.out.println(ip + " is any local address.");
		}
		else {
			System.out.println(ip + " is not any local address.");
		}
	}
	
	private static void demoAnyLocalAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkAnyLocalAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- Any Local Demo ---------------");
		
		demoAnyLocalAddress("80.80.80.80");
		demoAnyLocalAddress("127.0.0.3");
		demoAnyLocalAddress("128.0.0.3");
		demoAnyLocalAddress("127.255.255.255");
		demoAnyLocalAddress("0:0:0:0:0:0:0:0");
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}
}
