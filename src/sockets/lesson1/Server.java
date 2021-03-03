package sockets.lesson1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(65400);
			Socket accept = serverSocket.accept();
			Scanner scanner = new Scanner(accept.getInputStream());
			while(scanner.hasNext()) {
				String message = scanner.nextLine();
				System.out.println("\n\n\nserver input received\n");
				System.out.println(message);
				if(message.equals("exit")) {
					break;
				}
			}
			serverSocket.close();
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
