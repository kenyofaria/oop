package lesson4.object.reference.sample2;

public class Program {

	
	public static void main(String[] args) {
		Student student = new Student("Vitor", "123", "goiania", "software engineering");
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getRegistrationNumber());
		System.out.println(student.getCity());
		System.out.println(student.getCourse());
	}
	

}
