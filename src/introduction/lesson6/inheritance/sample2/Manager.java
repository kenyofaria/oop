package introduction.lesson6.inheritance.sample2;

public class Manager extends Employee {
	
	private String password;

	
	public Manager() {
		super();
	}
	
	public Manager(String registrationNumber, String name, double salary) {
		super.setRegistrationName(registrationNumber);
		super.setName(name);
		super.setSalary(salary);
	}
	public Manager(String registrationNumber, String name, double salary, String password) {
		super.setRegistrationName(registrationNumber);
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
		if(super.getSalary() >= 5000){
			return 0;
		}else {
			return super.getSalary() * 0.03;
		}
	}
	public double getRemuneration() {
		return getBonus() + super.getSalary();
	}
	
}
