package tcp.multiThreaded.v2.serverClient;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class MachineTwoV2 implements Runnable {
	public static void main(String argv[]) throws Exception {
		new MachineTwoV2();
	}

	public MachineTwoV2() throws Exception {

		// Listening at port 5000
		int listeningPort = 5000;
		ServerSocket ss = new ServerSocket(listeningPort);

		// Creates 2 threads
		Thread t = new Thread(this);
		t.start();

		// For RECEIVING data
		while (true) {
			System.out.println("Waiting on Port " + listeningPort + "..");
			Socket serverSocket = ss.accept();

			// Connects and gets unmarshalls data from client
			System.out.println("Connected..");
			DataInputStream inFromClient = new DataInputStream(
					serverSocket.getInputStream());

			// Check for image existence in local directory
			File f = new File("E:/ServerCode/3/cameraman.jpg");
			if (f.exists()) {
				System.out.println("Image already present..");
			} else {
				// If image is not present, create directory and construct image
				System.out
						.println("Image not present, Constructing received image..");
				new File("3").mkdir();
				FileOutputStream out = new FileOutputStream(
						"E:/ServerCode/3/cameraman.jpg");

				byte[] buffer = new byte[8192];
				int bytesRead = 0;

				// Writing data into file
				while ((bytesRead = inFromClient.read(buffer)) > 0) {
					out.write(buffer, 0, bytesRead);
				}
				System.out.println("Finished Constructing image..");
				// System.out.println("Received: " + new String(buffer));

				// Clear, flush, close
				out.flush();
				out.close();
			}
		}
	}

	// For SENDING data
	public void run() {
		String sendingHost = "localhost";
		int sendingPort = 6000;
		System.out.println("New thread created to send on port " + sendingPort);
		System.out.println("Type \"send\" to send..");

		// Ask user to start transfer by typing "send"
		Scanner s = new Scanner(System.in);
		String value = s.nextLine();
		System.out.println("User typed: " + value);

		// If user types "send", data is marshalled and sent
		if (value.equals("send")) {
			byte[] buffer = new byte[8192];
			int bytesRead = 0;

			// Find image to send
			try {
				FileInputStream fileIn = new FileInputStream(
						"E:/ServerCode/2/Desert.jpg");

				// Send at port 6000
				Socket clientSocket = new Socket(sendingHost, sendingPort);
				DataOutputStream outToServer = new DataOutputStream(
						clientSocket.getOutputStream());

				// Write on Socket
				while ((bytesRead = fileIn.read(buffer)) > 0) {
					outToServer.write(buffer, 0, bytesRead);
				}

				System.out.println("Finished Sending data");
				// System.out.println("To Server: " + new String(buffer));

				// Clear, flush, close
				outToServer.flush();
				outToServer.close();
				fileIn.close();
				clientSocket.close();
			} catch (Exception e) {
			}
		}
	}
}