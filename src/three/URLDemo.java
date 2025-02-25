package three;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo { 
	private static void showSimpleURLDemo() {
		URL url1 = URLInstance.createURL("ftp://google.com:8080/search=?name=bibek+karki#roll");
		URLInstance.print(url1,  "showSimpleURLDemo");
	}
	
	private static void printUrlMatches(URL url1, URL url2) {
		System.out.println("11. Test Same URL : " + (url2.equals(url1) ? "URL matched!" : "URL not matched!"));
	} 
	
	private static void testURLmatches() {
		URL url1 = URLInstance.createURL("http://google.com");
		URL url2 = URLInstance.createURL("https://google.com");
		
		printUrlMatches(url1, url2);
	}
		 
	private static void demoRelativeURL() {
		String baseUrlString = "https://google.com";
		
		URL url2 = URLInstance.createURL(baseUrlString, "/users/5");
		URL url3 = URLInstance.createURL(baseUrlString, "/products/guitar/56");
		
		URLInstance.print(url2, "demoRelativeURL");
		URLInstance.print(url3, "demoRelativeURL");
	}
	
	private static void demoURLToken() {
		URL url = URLInstance.createURL("https", "bibekkarki.com", 8080, "/koolkarkee");
		URLInstance.print(url, "demoURLThird");
	}
	
	private static void demoURLContent() {
		System.out.println("------- Calling from demoURLContent -------------");
		URLData.showDataWithOpenStream("https://google.com");
		System.out.println("--------------------------------------------------");
		
		System.out.println("------- Calling from demoURLContent -------------");
		URLData.showDataWithOpenConnection("https://www.facebook.com");
		System.out.println("--------------------------------------------------");
	
	}

	public static void main(String[] args) {
		showSimpleURLDemo();
		testURLmatches();
		demoRelativeURL();
		demoURLToken();
		demoURLContent();
	}

}
