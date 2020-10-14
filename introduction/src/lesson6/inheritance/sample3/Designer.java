package lesson6.inheritance.sample3;

public class Designer extends Employee{

	public Designer(String registrationNumber, String name, double salary) {
		super(registrationNumber, name, salary);
	}

	@Override
	public String getPassword() {
		return "";
	}
}
