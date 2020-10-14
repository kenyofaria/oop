package lesson6.inheritance.sample3;

public class Accountant extends Employee{

	public Accountant(String registrationNumber, String name, double salary) {
		super(registrationNumber, name, salary);
	}

	@Override
	public String getPassword() {
		return "";
	}
}
