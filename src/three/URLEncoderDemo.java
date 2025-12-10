package three;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoderDemo {

	public static void main(String[] args) {
		try {
			System.out.println(URLEncoder.encode("This string has spaces", "UTF-8"));
			System.out.println(URLEncoder.encode("This%string%has%spercentages", "UTF-8"));
			System.out.println(URLEncoder.encode("This+string+has+pluses", "UTF-8"));
			System.out.println(URLEncoder.encode("This/string/has/", "UTF-8"));
			System.out.println(URLEncoder.encode("This\\string\\has", "UTF-8"));
			System.out.println(URLEncoder.encode("This:string:has:colon","UTF-8"));
			System.out.println(URLEncoder.encode("This~string~has~tilde~sign","UTF-8"));
			System.out.println(URLEncoder.encode("This(string)has(parenthesis", "UTF-8"));
			System.out.println(URLEncoder.encode("This.string.has.periods","UTF-8"));
			System.out.println(URLEncoder.encode("This=string=has=","UTF-8"));
			System.out.println(URLEncoder.encode("This&string&has&ampersands","UTF-8"));
			System.out.println(URLEncoder.encode("This$string$hasnon-ASCIIcharacters","UTF-8"));
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		}
	}

}
