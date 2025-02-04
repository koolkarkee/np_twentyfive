package two;

import java.net.*;

import ipcharacteristics.TestAnyLocalAddress;
import ipcharacteristics.TestLinkLocalAddress;
import ipcharacteristics.TestLocalLoopBack;
import ipcharacteristics.TestMulticastAddress;
import ipcharacteristics.TestSiteLocalAddress;

public class IPCharacteristics { 
	 
	public static void main(String[] args) {
		try {
			TestLocalLoopBack.showDemo();
			TestAnyLocalAddress.showDemo(); 
			TestLinkLocalAddress.showDemo();
			TestSiteLocalAddress.showDemo();
			TestMulticastAddress.showDemo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
