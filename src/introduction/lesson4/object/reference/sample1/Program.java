package introduction.lesson4.object.reference.sample1;

public class Program {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "Vitor";
		student.registrationNumber = "123";
		student.city = "goiania";
		student.course = "software engineering";
		
		System.out.println(student.name);
		System.out.println(student.registrationNumber);
		System.out.println(student.city);
		System.out.println(student.course);
	}
	
}
