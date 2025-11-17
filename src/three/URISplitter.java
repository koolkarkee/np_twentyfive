package three;

import java.net.URI;
import java.net.URISyntaxException;

public class URISplitter {

	public static void main(String[] args) {
		try {
			URI uri = new URI("tel:+1-1024-520-632");
		
			//split 
			if(uri.isOpaque()) {
				System.out.println("The URI is opaque");
			}
			System.out.println("Scheme :" + uri.getScheme());
			System.out.println("Scheme Specific Part :" + uri.getSchemeSpecificPart());
			System.out.println("Fragment : " + uri.getFragment());
			System.out.println("User info : " + uri.getUserInfo());
			System.out.println("------------------");
			
			URI web = new URI("http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc");
			if(web.isOpaque()) {
				System.out.println("The URI is opaque");
			}
			else {
				System.out.println("The URI is not opaque");
			}
			System.out.println("Scheme :" + web.getScheme());
			System.out.println("Scheme Specific Part :" + web.getSchemeSpecificPart());
			System.out.println("Fragment : " + web.getFragment());
			System.out.println("User info : " + web.getUserInfo());

			//and so on
		} catch (URISyntaxException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
