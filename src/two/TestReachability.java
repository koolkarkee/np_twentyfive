package two;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestReachability {

	public static void main(String[] args) {
		//isReachable (InetAddress)
		try {
			InetAddress ia = InetAddress.getByName("www.bibektripathi.com.np");
			System.out.println(ia);
			boolean result;
			try {
				result = ia.isReachable(10000);
				System.out.println(result ? "The host is reachable" : "Not reachable");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
