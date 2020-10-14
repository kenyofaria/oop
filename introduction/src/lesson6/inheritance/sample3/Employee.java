package lesson6.inheritance.sample3;

public abstract class Employee {

	
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

	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
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
	public abstract String getPassword();
	
}
