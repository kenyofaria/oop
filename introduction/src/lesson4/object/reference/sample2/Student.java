package lesson4.object.reference.sample2;

public class Student {

	private String name;
	private String registrationNumber;
	private String city;
	private String course;
	
	
	public Student(String studentName, String studentNumber, String studentCity, String studentCourse) {
		name = studentName;
		registrationNumber = studentNumber;
		city = studentCity;
		course = studentCourse;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber.substring(0, 2) + "-" + registrationNumber.substring(2);
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCourse() {
		return course;
	}

}
