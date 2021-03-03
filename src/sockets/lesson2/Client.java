package sockets.lesson2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 65400);
			PrintStream out = new PrintStream(socket.getOutputStream());
			Scanner teclado = new Scanner(System.in);
			while(teclado.hasNext()) {
				String mensagem = teclado.nextLine();
				out.println(mensagem);
				if(mensagem.equals("exit")) {
					break;
				}
			}
			
			socket.close();
			teclado.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
