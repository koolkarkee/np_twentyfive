package three;

import java.net.ProxySelector;

public class ProxyDemo {

	public static void main(String[] args) {
		//instantiating LocalProxySelector 
		LocalProxySelector lps = new LocalProxySelector();
		
		//power?
		ProxySelector.setDefault(lps);
	}

}
