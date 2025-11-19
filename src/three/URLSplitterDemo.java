package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLSplitterDemo {

	public static void main(String[] args) {
		String myURL = "https://bibekkarki.com:8080/files?v=342&l=hari#345";
		
		try {
			URL url = new URL(myURL); 
			
			//Splitting the parts of the URL 
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port:"+url.getPort());
			System.out.println("Files: " + url.getFile());
			System.out.println("Authority:"+url.getAuthority());
			System.out.println("Query string:" +url.getQuery());
			System.out.println("default port:" + url.getDefaultPort());
//			System.out.println("content :" +url.getContent());
			System.out.println("Ref : " + url.getRef());
		} catch (MalformedURLException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
