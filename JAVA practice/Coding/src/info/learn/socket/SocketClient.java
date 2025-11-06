package info.learn.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {

	private Socket socket = null;
	private Scanner input = null;
	private DataOutputStream output = null;

	public SocketClient() {

	}

	public SocketClient(String ipAddress, int port) {

		try {
			socket = new Socket("127.0.0.1", 50000);
			input = new Scanner(System.in);
			output = new DataOutputStream(socket.getOutputStream());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String line = "";

		while (!line.equals("Exit")) {

			try {
				line = input.nextLine();
				output.writeUTF(line);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {			
			input.close();
			output.close();
			socket.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
			new SocketClient("127.0.0.1",3000);
	}
}
