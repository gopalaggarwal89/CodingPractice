package info.learn.socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {

	// initialize socket and input stream
	private Socket socket = null;
	private ServerSocket server = null;
	private Scanner in = null;

	// constructor with port
	public SocketServer(int port) {
		// starts server and waits for a connection
		try {
			server = new ServerSocket(port);
			System.out.println("Server started");

			System.out.println("Waiting for a client ...");

			socket = server.accept();
			System.out.println("Client accepted");

			// takes input from the client socket
			in = new Scanner(socket.getInputStream());

			String line = "";

			// reads message from client until "Over" is sent
			while (!line.equals("Over")) {
				try {
					line = in.nextLine();
					System.out.println(line);

				} catch (Exception i) {
					System.out.println(i);
				}
			}
			System.out.println("Closing connection");

			// close connection
			socket.close();
			in.close();
		} catch (Exception i) {
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		new SocketServer(5000);
	}

}
