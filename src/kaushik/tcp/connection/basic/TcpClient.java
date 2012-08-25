package kaushik.tcp.connection.basic;

import java.io.*;
import java.net.*;

class TcpClient {
	public static void main(String argv[]) throws Exception {
		String sentence;

		// BufferedReader inFromUser = new BufferedReader( new
		// InputStreamReader(System.in));
		// sentence = inFromUser.readLine();
		sentence = "Wake Up Windows";
		System.out.println("To Client: " + sentence);

		Socket clientSocket = new Socket("localhost", 5000);

		DataOutputStream outToServer = new DataOutputStream(
				clientSocket.getOutputStream());
		outToServer.writeUTF(sentence);

		clientSocket.close();
	}
}
