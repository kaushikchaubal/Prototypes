package udp.stringTransfer;

import java.io.*;
import java.net.*;

public class UdpClientString {
	public static void main(String args[]) throws Exception {
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(
				System.in));
		DatagramSocket clientSocket = new DatagramSocket(4000);

		byte[] address = new byte[] { (byte) 127, (byte) 0, (byte) 0, (byte) 1 };
		InetAddress IPAddress = InetAddress.getByAddress(address);

		byte[] receiveData = new byte[1024];

		DatagramPacket receivePacket = new DatagramPacket(receiveData,
				receiveData.length);

		clientSocket.connect(IPAddress, 4000);
		System.out.println("Listening for port 4000");
		clientSocket.receive(receivePacket);
		System.out.println("Received data");

		String modifiedSentence = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + modifiedSentence);
		clientSocket.close();
	}
}
