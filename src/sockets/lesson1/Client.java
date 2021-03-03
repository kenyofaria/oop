package sockets.lesson1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",65400);
			
			PrintStream out = new PrintStream(socket.getOutputStream());
			Scanner keyBoard = new Scanner(System.in);
			while(keyBoard.hasNext()) {
				String message = keyBoard.nextLine();
				out.println(message);
				if(message.equals("exit")) {
					break;
				}
			}
			keyBoard.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
