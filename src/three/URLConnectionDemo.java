package three;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");	

			URLConnection urlConnection = url.openConnection();
			InputStream inputStream = urlConnection.getInputStream(); 
			
			InputStreamReader reader = new InputStreamReader(inputStream);
			int c;
			while((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			System.out.println();
		} catch (IOException e) {
			e.getMessage();
		}

	}

}
