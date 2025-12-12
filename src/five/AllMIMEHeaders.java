package five;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

public class AllMIMEHeaders {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://mocki.io/v1/d1ccd5c3-d6ee-4fda-b6dd-030528bb2807");			
			try {
				URLConnection uc = url.openConnection();
				
				for (int i = 1; ; i++) {
					String header = uc.getHeaderField(i);
					//break condition
					if(header == null)
						break;
					
					String key = uc.getHeaderFieldKey(i);
					
					System.out.println(key + " : " + header);
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
	}

}
