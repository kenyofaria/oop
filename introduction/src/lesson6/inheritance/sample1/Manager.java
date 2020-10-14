package lesson6.inheritance.sample1;

public class Manager extends Employee {
	
	private String password;

	
	public Manager() {
		super();
	}
	
	public Manager(String registrationNumber, String name, double salary) {
		super.setRegistrationNumber(registrationNumber);
		super.setName(name);
		super.setSalary(salary);
	}
	public Manager(String registrationNumber, String name, double salary, String password) {
		super.setRegistrationNumber(registrationNumber);
		super.setName(name);
		super.setSalary(salary);
		this.password = password;
	}

	public Manager(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getBonus() {
		return super.getSalary() * 0.03;
	}
	public double getRemuneration() {
		return getBonus() + super.getSalary();
	}
	
}
