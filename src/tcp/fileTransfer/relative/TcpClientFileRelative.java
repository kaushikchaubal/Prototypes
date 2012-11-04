package tcp.fileTransfer.relative;

import java.io.*;
import java.net.*;

class TcpClientFileRelative {
	public static void main(String argv[]) throws Exception {
		String sentence;
		byte[] buffer = new byte[8192];
		int bytesRead = 0;

		FileInputStream fileIn = new FileInputStream(".//1/cameraman.jpg");
		Socket clientSocket = new Socket("localhost", 5000);
		DataOutputStream outToServer = new DataOutputStream(
				clientSocket.getOutputStream());

		while ((bytesRead = fileIn.read(buffer)) > 0) {
			outToServer.write(buffer, 0, bytesRead);
		}

		System.out.println("To Server: " + new String(buffer));

		outToServer.flush();
		outToServer.close();
		fileIn.close();

		clientSocket.close();
	}
}