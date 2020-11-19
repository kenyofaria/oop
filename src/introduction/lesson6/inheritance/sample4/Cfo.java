package introduction.lesson6.inheritance.sample4;

public class Cfo extends Employee implements Authenticatable{

	private UserAuthenticator authenticator;
	
	public Cfo(String registrationNumber, String name, double salary, String password) {
		super.setRegistrationNumber(registrationNumber);
		super.setName(name);
		super.setSalary(salary);
		authenticator = new UserAuthenticator(password, name);
	}

	@Override
	public boolean authenticate(String name, String password) {
		return this.authenticator.authenticate(name, password);
	}

	@Override
	public void setPassword(String password) {
		this.authenticator.setPassword(password);
		
	}
	
}
