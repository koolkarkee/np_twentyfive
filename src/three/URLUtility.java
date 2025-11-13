package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLUtility {

	public static void main(String[] args) {
		//check whether the two given URLs are same or not
		try {
			URL url1 = new URL("https://google.com");
			URL url2 = new URL("https://google.com");
			
			if(url1.equals(url2)) {
				System.out.println("Both are same URLs");
			}
			else {
				System.out.println("Different URLs");
			}
				
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}

	}

}
