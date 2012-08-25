package tcp.connection.string;

import java.io.*;
import java.net.*;

public class TcpServerString {
	public static void main(String[] args) {
		String clientSentence;
		ServerSocket ss;
		try {
			ss = new ServerSocket(5000);
			while (true) {
				System.out.println("Waiting");
				Socket serverSocket = ss.accept();

				System.out.println("Connected");
				DataInputStream inFromClient = new DataInputStream(
						serverSocket.getInputStream());
				clientSentence = inFromClient.readUTF();

				System.out.println("Received: " + clientSentence);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
