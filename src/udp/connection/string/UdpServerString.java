package udp.connection.string;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServerString {
	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(4000);

		byte[] sendData = new byte[1024];
		while (true) {

			byte[] address = new byte[] { (byte) 128, (byte) 237, (byte) 239,
					(byte) 105 };
			InetAddress IPAddress = InetAddress.getByAddress(address);
			int port = 4000;
			String data = "test";
			sendData = data.getBytes();

			DatagramPacket sendPacket = new DatagramPacket(sendData,
					sendData.length, IPAddress, port);
			serverSocket.send(sendPacket);
		}
	}
}