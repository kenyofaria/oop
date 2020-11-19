package introduction.lesson6.inheritance.sample2;

public class Employee {

	
	private String registrationNumber;
	private String name;
	private double salary;
	

	public Employee() {
		
	}
	
	public Employee(String registrationNumber, String name, double salary) {
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.salary = salary;
	}

	public String getRegistrationName() {
		return registrationNumber;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setRegistrationName(String registrationName) {
		this.registrationNumber = registrationName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return this.salary * 0.05;
	}
	public double getRemuneration() {
		return getBonus() + this.salary;
	}
	
}
