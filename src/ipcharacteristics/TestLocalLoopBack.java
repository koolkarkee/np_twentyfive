package ipcharacteristics;

import java.net.InetAddress;

public class TestLocalLoopBack {
	private static void checkLoopBackAddress(InetAddress address, String ip) {
		if(address.isLoopbackAddress()) {
			System.out.println(ip + " is a local loop back address.");
		}
		else {
			System.out.println(ip + " is not a local loop back address.");
		}
	}
	
	private static void demoLocalLoopBackAddress(String ip) {
		try {
			InetAddress address = InetAddress.getByName(ip);
			checkLoopBackAddress(address, ip); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showDemo() {
		System.out.println("------------- Loop Back Address Demo ---------------");
		
		demoLocalLoopBackAddress("127.0.0.1");
		demoLocalLoopBackAddress("128.0.0.1");
		
		System.out.println("----------------------------\n");
	}
	
	public static void main(String[] args) {
		showDemo();
	}

}
