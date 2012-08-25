package tcp.connection.multiThreaded.serverClient;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class MachineTwo implements Runnable {
	public static void main(String argv[]) throws Exception {
		new MachineTwo();
	}

	public MachineTwo() throws Exception {

		ServerSocket ss = new ServerSocket(5000);
		Thread t = new Thread(this);
		t.start();

		while (true) {
			System.out.println("Waiting");
			Socket serverSocket = ss.accept();

			System.out.println("Connected");
			DataInputStream inFromClient = new DataInputStream(
					serverSocket.getInputStream());

			boolean success = (new File("3")).mkdir();
			FileOutputStream out = new FileOutputStream(
					"E:/ServerCode/3/cameraman.jpg");

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

	public void run() {
		System.out.println("New Thread");
		Scanner s = new Scanner(System.in);
		String value = s.nextLine();
		System.out.println("Value: " + value);

		if (value.equals("send")) {
			byte[] buffer = new byte[8192];
			int bytesRead = 0;

			try {
				FileInputStream fileIn = new FileInputStream(
						"E:/ServerCode/2/Desert.jpg");
				Socket clientSocket = new Socket("localhost", 6000);
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
			} catch (Exception e) {
			}
		}
	}
}