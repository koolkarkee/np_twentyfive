package three;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class LocalProxySelector extends ProxySelector {

	@Override
	public List<Proxy> select(URI uri) {
		List<Proxy> list = new ArrayList<Proxy>();
		
		//creating a socket address for the proxy
		SocketAddress addr = new InetSocketAddress("proxy.example.com", 8000);
		
		//instantiating a new proxy object for the proxy
		Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
		
		//adding proxy to the list
		list.add(proxy);
		//list.add(proxy2); //.............
		
		return list;
	}

	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
		
	}

}
