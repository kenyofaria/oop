package introduction.lesson5.object.composition.sample1;

public class Program {
	
	public static void main(String[] args) {
		City city = new City("goiania", "123455", "go");
		Course course = new Course("25", "software engineering", "noturno");
		
		Student vitor = new Student("Vitor", "123", city, course);
		Student helena = new Student("Helena", "323", city, course);
		Student adriana = new Student("Adriana", "837", city, course);
		Student kenyo = new Student("Kenyo", "986", city, course);
		
		
		System.out.println(vitor);
		System.out.println(helena);
		System.out.println(adriana);
		System.out.println(kenyo);
		
		System.out.println(Student.TOTAL_STUDENT);
		
	}
	
}
