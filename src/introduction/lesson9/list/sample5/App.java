package introduction.lesson9.list.sample5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		try {
			BufferedReader br = prepareInputReader();
			
			String input = br.readLine();
			
			while(input!=null && !input.equals("exit")) {
				if(input.equals("list")) {
					listAllStudents(list);
				}else {
					list.add(new Student(input));
				}
				input = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static BufferedReader prepareInputReader() {
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	private static void listAllStudents(ArrayList<Student> list) {
		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s.getName());
		}
	}
}
