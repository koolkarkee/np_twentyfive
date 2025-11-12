package two;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

public class SpamCheck {
	public static final String BLACKHOLE = "sbl.spamhaus.org";
	
	
	private static String reverseIp(String ipAddress) {
        String[] parts = ipAddress.split("\\.");
        return parts[3] + "." + parts[2] + "." + parts[1] + "." + parts[0];
    }
	private static boolean isSpam(String ipAddress) throws UnknownHostException {
		try {
			InetAddress address = InetAddress.getByName(ipAddress);
			byte[] quad = address.getAddress();
			String query = BLACKHOLE;
			
			for(byte octet : quad) {
				int unsignedByte = octet < 0 ? octet + 256 : octet;
				query = unsignedByte + "." + query;				
			}
			InetAddress.getByName(query);
			return true;
		} catch(Exception ex) {
			//System.err.println(ex.getMessage());
			return false;
		}
	}
	
	private static void printSpam(String ipAddress) {
		try {
			if(isSpam(ipAddress)) {
				System.out.println(ipAddress + " is a spam");
			}
			else {
				System.out.println(ipAddress + " is not a spam");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String testIpSpam = "192.168.10.76"; 
        printSpam(testIpSpam);
        
        //printSpam("cryptogrowthanalysis.com@usa.com");
 	}

}
