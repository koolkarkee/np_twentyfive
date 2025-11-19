package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLSimpleDemo {

	public static void main(String[] args) {
		try {
			URL url1 = new URL("https://google.com");
			System.out.println(url1);
			
			//absolute url
			URL url2 = new URL("https://google.com");
			System.out.println(url2);
			
			//relative url
			URL url3 = new URL(url2, "files");
			System.out.println(url3);
			
			//scheme, authority, files
			URL url4 = new URL("ftp", "ishwordulal.com.np", "/files");
			System.out.println(url4);
			
			//
			URL url5 = new URL("http", "prashant.com", 6565, "/files");
			System.out.println(url5);
			
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
