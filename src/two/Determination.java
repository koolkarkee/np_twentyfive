package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Determination {
	public static int getIpAddressVersion(InetAddress ia) {
		try {
			byte[] address = ia.getAddress();
			if(address.length == 4) return 4; 
			else if(address.length == 16) return 6;
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}
	

	public static void main(String[] args) throws UnknownHostException {
		//my ip address v4
		String ip = "163.70.145.35";
		InetAddress ia = InetAddress.getByName(ip);
		
		int version = getIpAddressVersion(ia);
		System.out.println("IP version is v" + version);
		
		String ip2 = "1050:0000:0000:0000:0005:0600:300c:326b";
		InetAddress ia2 = InetAddress.getByName(ip2);
		
		int version2 = getIpAddressVersion(ia2);
		System.out.println("IP version is v" + version2);
		
	}

}
