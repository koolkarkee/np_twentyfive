package seven;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.logging.*;

public class JHTTP {
    private static final Logger logger = Logger.getLogger(JHTTP.class.getCanonicalName());
    private static final int NUM_THREADS = 50;
    private static final String INDEX_FILE = "index.html";
    private final File rootDirectory;
    private final int port;

    public JHTTP(File rootDirectory, int port) throws IOException {
        if (!rootDirectory.isDirectory()) {
            throw new IOException(rootDirectory + " does not exist as a directory");
        }
        this.rootDirectory = rootDirectory;
        this.port = port;
    }

    public void start() throws IOException {
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);
        try (ServerSocket server = new ServerSocket(port)) {
            logger.info("Accepting connections on port " + server.getLocalPort());
            logger.info("Document Root: " + rootDirectory);

            while (true) {
                try {
                    Socket request = server.accept();
                    Runnable r = new RequestProcessor(rootDirectory, INDEX_FILE, request);
                    pool.submit(r);
                } catch (IOException ex) {
                    logger.log(Level.WARNING, "Error accepting connection", ex);
                }
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java seven.JHTTP <document_root> <port>");
            return;
        }

        try {
            File docroot = new File(args[0]);
            int port = Integer.parseInt(args[1]);
            JHTTP httpServer = new JHTTP(docroot, port);
            httpServer.start();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Server could not start", ex);
        }
    }
}

/**
 * Handles individual HTTP requests.
 */
class RequestProcessor implements Runnable {
    private final File rootDirectory;
    private final String indexFileName;
    private final Socket connection;

    public RequestProcessor(File rootDirectory, String indexFileName, Socket connection) {
        this.rootDirectory = rootDirectory;
        this.indexFileName = indexFileName;
        this.connection = connection;
    }

    @Override
    public void run() {
        try (OutputStream raw = new BufferedOutputStream(connection.getOutputStream());
             Writer out = new OutputStreamWriter(raw);
             Reader in = new InputStreamReader(connection.getInputStream())) {

            BufferedReader reader = new BufferedReader(in);
            String requestLine = reader.readLine();
            if (requestLine == null || requestLine.isEmpty()) return;

            String[] tokens = requestLine.split("\\s+");
            String method = tokens[0];
            String fileName = tokens[1];

            if (fileName.endsWith("/")) {
                fileName += indexFileName;
            }

            File requestedFile = new File(rootDirectory, fileName.substring(1));
            if (requestedFile.isFile()) {
                byte[] content = readFileData(requestedFile);
                out.write("HTTP/1.1 200 OK\r\n");
                out.write("Content-Length: " + content.length + "\r\n");
                out.write("Content-Type: text/html\r\n\r\n");
                out.flush();
                raw.write(content);
                raw.flush();
            } else {
                String errorMessage = "<h1>404 Not Found</h1>";
                out.write("HTTP/1.1 404 Not Found\r\n");
                out.write("Content-Length: " + errorMessage.length() + "\r\n");
                out.write("Content-Type: text/html\r\n\r\n");
                out.write(errorMessage);
                out.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(RequestProcessor.class.getCanonicalName())
                  .log(Level.WARNING, "Error processing request", ex);
        } finally {
            try {
                connection.close();
            } catch (IOException ignored) {}
        }
    }

    private byte[] readFileData(File file) throws IOException {
        try (InputStream in = new FileInputStream(file)) {
            return in.readAllBytes();
        }
    }
}
