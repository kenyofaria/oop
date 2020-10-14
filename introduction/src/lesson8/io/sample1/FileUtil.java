package lesson8.io.sample1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtil {
	
	
	private String file;

	public FileUtil() {
		
	}
	
	public FileUtil(String file) {
		this.file = file;
		
	}

	public String contentFile(String file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String register = br.readLine();
			String content = "";
			
			while(register!=null) {
				content = content + register + System.lineSeparator();
				register = br.readLine();
			}
			br.close();
			return content;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String contentFile() {
		return contentFile(this.file);
	}
	
	public void writeInFile(String file, String register) {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.append(register + System.lineSeparator());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void writeInFile(String register) {
		writeInFile(this.file, register);
		
	}
}
