package three;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLContentRead {

	//read the contents of the given URL 
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			//System.out.println(url);
			
			//open the stream
			InputStream inputStream = url.openStream();
			
			int c; //for ascii character
			while((c = inputStream.read()) != -1) { //-1 denotes end of file
				char ch = (char)c; //type cast to character
				System.out.print(ch);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
