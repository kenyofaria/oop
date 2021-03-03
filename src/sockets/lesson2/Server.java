package sockets.lesson2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(65400);
			Socket accept = serverSocket.accept();
			Scanner scanner = null;
			while(true) {
				scanner = new Scanner(accept.getInputStream());	
				String mensagem = scanner.nextLine();
				if(mensagem.equals("exit")) {
					break;
				}else {
					System.out.println("\n\n\nmensagem recebida pelo server\n");
					System.out.println(mensagem);
				}
				
			}
			scanner.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
