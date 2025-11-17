package three;

import java.net.URI;
import java.net.URISyntaxException;

public class URIBasic {

	public static void main(String[] args) {
		//construct a URI 
		try {
			//as a URL 
			URI uri1 = new URI("https://www.google.com");
			System.out.println(uri1);
			
			URI voice = new URI("tel:+1-800-8800-9923");
			System.out.println(voice);
			
			URI web = new URI("http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc");
			System.out.println(web);
			
			URI absolute = new URI("http", "//www.ibiblio.org", null); 
			System.out.println(absolute);
			
			URI relative = new URI(null, "/javafaq/index.shtml", "today"); 
			System.out.println(relative);
		} catch (URISyntaxException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
