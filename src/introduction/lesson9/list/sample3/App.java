package introduction.lesson9.list.sample3;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Kenyo");
		list.add("Adriana");
		list.add("Helena");
		list.add("Vítor");
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
