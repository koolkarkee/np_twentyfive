package two;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTypesDemo {
	
	static void printMessage(String msg, String ip) {
		System.out.println(ip + " is " + msg + " address");
	}

	public static void main(String[] args) {
		String myIP = "ff01:db8:3333:4444:5555:6666:7777:8888";
		//String myIP = "227.0.0.1";
		
		//check the types of addresses 
		try {
			InetAddress ia = InetAddress.getByName(myIP);
			
			//wildcard address?
			if(ia.isAnyLocalAddress()) {
				printMessage("Any Local", myIP);
			}
			//loopback address (localhost)
			else if(ia.isLoopbackAddress()) {
				printMessage("Loopback", myIP);
			}
			//link local address 
			else if(ia.isLinkLocalAddress()) {
				printMessage("Link Local", myIP);
			}
			//site local
			else if(ia.isSiteLocalAddress()) {
				printMessage("Site Local", myIP);
			}
			//multicast address 
			else if(ia.isMulticastAddress()) {
				//multicast global (MCGlobal)
				if(ia.isMCGlobal()) {
					printMessage("MCGlobal", myIP);
				}
				//MCOrgLocal (organization wide multicast address)
				else if(ia.isMCOrgLocal()) {
					printMessage("MCOrgLocal", myIP);
				}
				//MCSiteLocal (Site wise)
				else if(ia.isMCSiteLocal()) {
					printMessage("MCSiteLocal", myIP);
				}
				//MCLinkLocal (subnet wide)
				else if(ia.isMCLinkLocal()) {
					printMessage("MCLinkLocal", myIP);
				}
				//MCNodeLocal (interface local)
				else if(ia.isMCNodeLocal()) {
					printMessage("MCNodeLocal", myIP);
				}
				//printMessage("Multicast", myIP);
			}
			else {
				System.out.println("not");
			}
		} catch (UnknownHostException e) { 
			System.out.println(e.getMessage());
		}

	}

}
