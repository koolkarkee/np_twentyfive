package two;

import java.net.*;

import ipcharacteristics.TestAnyLocalAddress;
import ipcharacteristics.TestLinkLocalAddress;
import ipcharacteristics.TestLocalLoopBackAddress;
import ipcharacteristics.TestMCGlobalAddress;
import ipcharacteristics.TestMCLinkLocalAddress;
import ipcharacteristics.TestMCNodeLocalAddress;
import ipcharacteristics.TestMCOrgLocalAddress;
import ipcharacteristics.TestMCSiteLocalAddress;
import ipcharacteristics.TestMulticastAddress;
import ipcharacteristics.TestSiteLocalAddress;

public class IPCharacteristics { 
	 
	public static void main(String[] args) {
		try {
			TestLocalLoopBackAddress.showDemo();
			TestAnyLocalAddress.showDemo(); 
			TestLinkLocalAddress.showDemo();
			TestSiteLocalAddress.showDemo();
			TestMulticastAddress.showDemo();
			
			TestMCGlobalAddress.showDemo();
			TestMCOrgLocalAddress.showDemo();
			TestMCSiteLocalAddress.showDemo();
			TestMCLinkLocalAddress.showDemo();
			TestMCNodeLocalAddress.showDemo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
