package web.proxy.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ProxyServerV1 implements Runnable { 

	Socket client = null, server = null;
	String host = "127.0.0.1";
	int remoteport;

	public static void main(String[] args) throws IOException {
		try {
			int localport = 1026;
			System.out.println("Starting proxy for: on port " + localport);
			ProxyServerV1 p = new ProxyServerV1();
			p.runServer(localport); // never returns
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void runServer(int localport)
	{
		// Create a ServerSocket to listen for connections with
		ServerSocket ss=null;
		try {
			ss = new ServerSocket(localport);
			ss.setSoTimeout(0);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		while (true) {
			try {
				// Wait for a connection on the local port
				client = ss.accept();
				Thread t = new Thread(this);
				t.start();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

	public void run(){
		System.out.println("I created a thread for a NEW request");
		byte[] request = new byte[1024];
		byte[] reply = new byte[4096];
		
		InputStream streamFromClient = null;
		OutputStream streamToClient = null;

		try {
			streamFromClient = client.getInputStream();
			streamToClient = client.getOutputStream();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		BufferedReader in = new BufferedReader (new InputStreamReader (streamFromClient));
		//DataInputStream in = new DataInputStream(streamFromClient);
		
		boolean mySite = false;
		String req = "";

		while(in != null){
			String s = null;
			
			try{
				if(in!=null)
					s = in.readLine();
					System.out.println("Prachi " + s);
				}
			catch(IOException e){
				e.printStackTrace();
			}
			
			//GET http://www.bing.com/ HTTP/1.1
			if(s!=null){
			if(s.indexOf("GET") != -1){
				int a = s.indexOf("/");
				int k = s.indexOf("http");
				String n  = s.substring(0, k);
				a = s.indexOf("/", a+1);
				int b = s.indexOf("/", a+1);
				String m  = s.substring(b);
				String result = n.concat(m);
				host = s.substring(a+1, b);
				s = result;
				System.out.println("I am sending " + s);
			}

			if(s.contains("Host: www.18842team4.com")){
				s = "Host: 127.0.0.1:8088";
				host = "127.0.0.1";
				mySite = true;
			}
			if(s.equals("Proxy-Connection: keep-alive")){
				s = "Connection: close";
			}

			if (s.equals("")){
				s = s + "\r\n";
				req = req + s;
				break;
			} else 
				s = s + "\r\n";
			req = req + s;
			}
		}
		// Make a connection to the real server.
		try {
			InetAddress ia = InetAddress.getByName(host);
			System.out.println(host);
			if(mySite){
				server = new Socket(host, 8088);
				server.setSoTimeout(0);
				PrintWriter out = new PrintWriter(streamToClient);
				out.print("Proxy server cannot connect to " + host + ":"
						+ remoteport + ":\n" + "\n");
			}
			else
				server = new Socket(host, 80);
				server.setSoTimeout(0);
			System.out.println("Created socket to connect to www.shop.com on " + ia + ":" + remoteport);

			System.out.println("Sending: "); 
			request = req.getBytes();
			OutputStream streamToServer = server.getOutputStream();
			streamToServer.write(request);

			// Listen to HTTP response from webserver to the proxy 
			System.out.println(req);

		} catch (IOException e) {
			PrintWriter out = new PrintWriter(streamToClient);
			out.print("Proxy server cannot connect to " + host + ":"
					+ remoteport + ":\n" + e + "\n");
			out.flush();
			try {
				client.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		// Get server streams.
		InputStream streamFromServer = null;
		try {
			streamFromServer = server.getInputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//final OutputStream streamToServer = server.getOutputStream();
		int bytesRead;
		try {
			while ((bytesRead = streamFromServer.read(reply)) != -1) {
				streamToClient.write(reply, 0, bytesRead);
				streamToClient.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		 The server closed its connection to us, so we close our
//		 connection to our client.
		try {
			streamToClient.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			if (server != null)
				server.close();
			if (client != null)
				client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
