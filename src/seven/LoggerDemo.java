package seven;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		try {
			ServerSocket socket = new ServerSocket(88080, 10, InetAddress.getLocalHost());
			
			//success log
			log.log(Level.INFO, "Successfully Socket created");
		} catch (UnknownHostException e) {
			//error logs
			log.log(Level.SEVERE, e.getMessage());
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
	}

}
