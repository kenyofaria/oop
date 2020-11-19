package introduction.lesson9.list.sample4;


public class Student implements Comparable<Student>{

	private String registerNumber;
	private String name;
	
	public Student(String registerNumber, String name) {
		super();
		this.registerNumber = registerNumber;
		this.name = name;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}
	
}
