package five;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionDemo {

	public static void main(String[] args) {
		String urlString = "https://www.google.com";
		try {
			URL url = new URL(urlString);
			
			//create a URLConnection
			try {
				URLConnection uc = url.openConnection();
				
				//??HttpURLConnection = ??
				HttpURLConnection httpUc = (HttpURLConnection) uc;
				
				//HttpURLConnection httpUc = (HttpURLConnection) url.openConnection();
				
				//input and output operations
				System.out.println(httpUc.getURL());
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
	}

}
