package lesson9.list.sample2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student joao = new Student("111", "joão");
		Student mario = new Student("222", "Mário");
		Student luiz = new Student("333", "Luiz");
		
		list.add(joao);
		list.add(mario);
		list.add(luiz);
		
		for (Student student : list) {
			System.out.println(student.getName() + "  -  " + student.getRegisterNumber());
		}
	}
}
