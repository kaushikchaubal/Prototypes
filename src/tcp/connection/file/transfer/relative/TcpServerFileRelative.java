package tcp.connection.file.transfer.relative;

import java.io.*;
import java.net.*;

class TcpServerFileRelative {
	public static void main(String argv[]) throws Exception {
		String clientSentence;
		ServerSocket ss = new ServerSocket(5000);

		while (true) {
			System.out.println("Waiting");
			Socket serverSocket = ss.accept();

			System.out.println("Connected");
			DataInputStream inFromClient = new DataInputStream(
					serverSocket.getInputStream());

			boolean success = (new File("2")).mkdir();
			FileOutputStream out = new FileOutputStream(".//2/cameraman.jpg");

			byte[] buffer = new byte[8192];
			int bytesRead = 0;
			while ((bytesRead = inFromClient.read(buffer)) > 0) {
				out.write(buffer, 0, bytesRead);
			}
			out.flush();
			out.close();
			System.out.println("Received: " + new String(buffer));

		}
	}
}
