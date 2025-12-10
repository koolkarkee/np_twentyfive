package five;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Date;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			//create a url 
//			URL url = new URL("https://mocki.io/v1/d1ccd5c3-d6ee-4fda-b6dd-030528bb2807");
			URL url = new URL("https://www.google.com");
			
			//get a URLConnection object 
			try {
				URLConnection uc = url.openConnection();
				
				//get date
				long d = uc.getDate();
				System.out.println(new Date(d));
				
				//get content type
				System.out.println("Content-Type: " + uc.getContentType());
				
				//get expiration date 
				System.out.println("Expiration Date: " + new Date(uc.getExpiration()));
				
				//last modified date
				System.out.println("Last Modified Date: " + new Date(uc.getLastModified()));
				
				//content length 
				int len = uc.getContentLength();
				System.out.println("Content-length: " + uc.getContentLength());
				
				//content 
				if(len >= 0) {
					InputStream is = uc.getInputStream();
					int c;
					while((c = is.read()) != -1) {
						System.out.print((char)c);
					}
				}
				
			} catch (IOException e) {
				System.err.println(e.getMessage()); //err
			}
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
	}
}
