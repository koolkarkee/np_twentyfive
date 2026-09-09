package two;
import java.net.InetAddress;

public class GettersMethodDemo {
	public static void main(String[] args) {
		//this will generate error => 
		//InetAddress inetAddress = new InetAddress();
		
		try {
			//use the factory method to get InetAddress object
			InetAddress inetAddress = InetAddress.getByName("www.kathford.edu.np");
			//System.out.println(inetAddress);
			
			//get localhost
//			InetAddress inetAddress2 = InetAddress.getLocalHost();
//			System.out.println(inetAddress2);
			
			String machineName = inetAddress.getHostName();
			System.out.println(machineName);
			System.out.println(inetAddress.getCanonicalHostName());
			System.out.println(inetAddress.getAddress());
			System.out.println(inetAddress.getHostAddress());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
