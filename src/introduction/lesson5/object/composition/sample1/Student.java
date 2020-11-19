package introduction.lesson5.object.composition.sample1;

public class Student {	
	private String name;
	private String registrationNumber;
	private City city;
	private Course course;
	
	public static int TOTAL_STUDENT = 0; 
	
	
	public Student(String studentName, String studentNumber, City studentCity, Course sutudentCourse) {
		name = studentName;
		registrationNumber = studentNumber;
		city = studentCity;
		course = sutudentCourse;
		TOTAL_STUDENT += 1;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber.substring(0, 2) + "-" + registrationNumber.substring(2);
	}
	
	public City getCity() {
		return city;
	}
	
	public Course getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return name + "\n" + registrationNumber + "\n" + city + "\n" + course + "\n";
	}
}
