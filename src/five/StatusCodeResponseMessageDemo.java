package five;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class StatusCodeResponseMessageDemo {

	public static void main(String[] args) {
		String myUrl  = "https://google.com";
		try {
			URL url = new URL(myUrl);
			try {
				URLConnection uc = url.openConnection();
				HttpURLConnection httpCon = (HttpURLConnection) uc;
			
				int statusCode = httpCon.getResponseCode();
				String responseMessage = httpCon.getResponseMessage();
				
				// printing status code and response message
				System.out.println("Status Code : " + statusCode);
				System.out.println("Response Message : " + responseMessage);
			
				//printing headers
				
				//printing content
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		} catch (MalformedURLException ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
