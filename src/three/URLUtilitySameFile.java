package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLUtilitySameFile {

	//check whether both url point to the same file
	public static void main(String[] args) {
		try {
			URL url1 = new URL("http://ncsa.uiuc.edu/htmlprimer.html#gs");
			System.out.println(url1.getFile());
			
			URL url2 = new URL("http://ncsa.uiuc.edu/htmlprimer.html#hd");
			System.out.println(url2.getFile());

			if(url1.sameFile(url2)) {
				System.out.println("Both URL point to the same file");
			}
			else {
				System.out.println("They point to different files");
			}
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}

	}

}
