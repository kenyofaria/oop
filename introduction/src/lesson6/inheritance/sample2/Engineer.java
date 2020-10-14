package lesson6.inheritance.sample2;

public class Engineer extends Employee {

	
	public Engineer(String registrationNumber, String name, double salary) {
		super(registrationNumber, name, salary);
	}
	
	public double getBonus() {
		return super.getSalary() * 0.01;
	}
}
