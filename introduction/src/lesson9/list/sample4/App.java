package lesson9.list.sample4;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("111","Vítor"));
		list.add(new Student("222","Helena"));
		list.add(new Student("333","Kenyo"));
		list.add(new Student("444","Adriana"));
		
		for (Student student : list) {
			System.out.println(student.getName());
		}
		
		System.out.println("-----------------------------------------");
		
		Collections.sort(list);
		
		for (Student student : list) {
			System.out.println(student.getName());
		}
		
	}
}
