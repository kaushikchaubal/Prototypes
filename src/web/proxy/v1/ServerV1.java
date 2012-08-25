package web.proxy.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV1 {
	public static void main(String[] args) throws IOException {
		try {
			String host = "";
			int remoteport = 80;
			int localport = 1026;

			// Print a start-up message
			System.out.println("Starting proxy for " + host + ":" + remoteport
					+ " on port " + localport);

			// And start running the server
			runServer(host, remoteport, localport); // never returns
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	/**
	 * runs a single-threaded proxy server on
	 * the specified local port. It never returns.
	 * @throws InterruptedException 
	 */
	public static void runServer(String host, int remoteport, int localport)
	throws IOException, InterruptedException {
		// Create a ServerSocket to listen for connections with
		ServerSocket ss = new ServerSocket(localport);

		final byte[] request = new byte[1024];
		byte[] reply = new byte[4096];

		while (true) {
			Socket client = null, server = null;
			try {
				// Wait for a connection on the local port
				client = ss.accept();

				final InputStream streamFromClient = client.getInputStream();
				final OutputStream streamToClient = client.getOutputStream();

				// Make a connection to the real server.
				// If we cannot connect to the server, send an error to the
				// client, disconnect, and continue waiting for connections.

				BufferedReader in = new BufferedReader (new InputStreamReader (streamFromClient));
				String s=in.readLine();
				System.out.println("S is:" +s);

				if(s.contains("GET")){
					int a = s.indexOf("/");
					a = s.indexOf("/", a+1);
					int b = s.indexOf("/", a+1);
					host = s.substring(a+1, b);
				}

				try {
					System.out.println("***********HOST:" + host + " with size " + host.length());
					server = new Socket(host, remoteport);
				} catch (IOException e) {
					PrintWriter out = new PrintWriter(streamToClient);
					out.print("Proxy server cannot connect to " + host + ":"
							+ remoteport + ":\n" + e + "\n");
					out.flush();
					client.close();
					continue;
				}

				System.out.println("here 1");
				// Get server streams.
				final InputStream streamFromServer = server.getInputStream();
				final OutputStream streamToServer = server.getOutputStream();

				System.out.println("here 2");
				// a thread to read the client's requests and pass them
				// to the server. A separate thread for asynchronous.
				Thread t = new Thread() {
					public void run() {
						System.out.println("here 4");
						int bytesRead;
						try {
							while ((bytesRead = streamFromClient.read(request)) != -1) {
								System.out.println("here 5");
								System.out.println(">>>>>" + new String(request));
								streamToServer.write(request, 0, bytesRead);
								streamToServer.flush();
							}
						} catch (IOException e) {
						}

						// the client closed the connection to us, so close our
						// connection to the server.
						try {
							streamToServer.close();
						} catch (IOException e) {
						}
					}
				};

				System.out.println("here 3");
				// Start the client-to-server request thread running
				t.start();
				Thread.sleep(10);
				System.out.println("here 6");
				// Read the server's responses
				// and pass them back to the client.
				int bytesRead;
				try {
					System.out.println("here 7");
					while ((bytesRead = streamFromServer.read(reply)) != -1) {
						streamToClient.write(reply, 0, bytesRead);
						streamToClient.flush();
					}
				} catch (IOException e) {
				}

				// The server closed its connection to us, so we close our
				// connection to our client.
				streamToClient.close();
			} catch (IOException e) {
				System.err.println(e);
			} finally {
				try {
					if (server != null)
						server.close();
					if (client != null)
						client.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
