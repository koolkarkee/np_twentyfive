package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLInstance {
	//first way, simple way
	public static URL createURL(String urlString) {
		URL url = null;
		try {
			url = new URL(urlString);
		} 
		catch(MalformedURLException ex) {
			System.err.println("Malformed URL Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
		}
		return url;
	}
	
	//via baseurl constructing relative url
	public static URL createURL(String baseUrlString ,String relativeURLString) {
		URL url = null;
		try {
			URL baseUrl = createURL(baseUrlString);
			url = new URL(baseUrl, relativeURLString);			
		}catch(MalformedURLException ex) {
			System.err.println("Malformed URL Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
		}
		return url;
	}
	
	//via individual tokens of URL
	public static URL createURL(String scheme, String host, int port, String file) {
		URL url = null;
		try {
			url = new URL(scheme, host, port, file);			
		} catch(MalformedURLException ex) {
			System.err.println("Malformed URL Exception : " + ex.getMessage());
		}
		catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
		}
		return url;
	}
	
	public static void print(URL url, String methodName) {
		System.out.println("------------- Calling from " + methodName + "----------\n");
		
		//printing the URL object
		System.out.println("01. URL : " + url.toString());
		System.out.println("02. Protocol : " + url.getProtocol());
		System.out.println("03. Host : " + url.getHost());
		System.out.println("04. Port : " + url.getPort());
		System.out.println("05. File : " + url.getFile());
		System.out.println("06. Authority : " + url.getAuthority());
		System.out.println("07. Query : " + url.getQuery());
		System.out.println("08. Default Port : " + url.getDefaultPort());
		System.out.println("09. Ref : " + url.getRef());
		
		System.out.println("\n--------------------------------------");
	}
}
