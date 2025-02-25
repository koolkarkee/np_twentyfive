package three;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLData {
	public static void showDataWithOpenStream(String urlString) {
		URL url = URLInstance.createURL(urlString);		
		try {
			InputStream inputStream = url.openStream();
			
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
	
	public static void showDataWithOpenConnection(String urlString) {
		URL url = URLInstance.createURL(urlString);		
		try {
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