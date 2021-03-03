package sockets.lesson3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class AgentB {

	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		try {
			serverSocket = new ServerSocket(64500);
			Socket socketAccepted = serverSocket.accept();
			System.out.println("there is a client connected -> " + socketAccepted.getInetAddress().getHostName());
			Scanner message = new Scanner(socketAccepted.getInputStream());
			System.out.println(socketAccepted.getInetAddress().getHostName() + " -- " + message.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
