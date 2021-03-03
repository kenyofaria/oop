package sockets.lesson3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class AgentA {

	private static Socket clientSocket;

	public static void main(String[] args) {
		try {
			clientSocket = new Socket("localhost", 64500);
			System.out.println("successful connection");
			
			PrintStream out = new PrintStream(clientSocket.getOutputStream());
			Scanner keyBoard = new Scanner(System.in);
			while(keyBoard.hasNext()) {
				String line = keyBoard.nextLine();
				if(line.trim().equals("")) {
					break;
				}
				out.println(line);
			}
			clientSocket.close();
			keyBoard.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
