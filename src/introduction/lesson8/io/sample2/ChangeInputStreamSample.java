package introduction.lesson8.io.sample2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChangeInputStreamSample {
	public static void main(String[] args) {
		try {
			InputStream fis = System.in;
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String input = br.readLine();
			
			while(input!=null && !input.equals("quit")) {
				System.out.println(input);
				input = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
