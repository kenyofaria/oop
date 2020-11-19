package introduction.lesson6.inheritance.sample4;

public class Manager extends Employee implements Authenticatable{
	
	private UserAuthenticator authenticator;
	
	
	public Manager() {
		super();
	}
	
	public Manager(String registrationNumber, String name, double salary, String password) {
		
		super.setRegistrationNumber(registrationNumber);
		super.setName(name);
		super.setSalary(salary);
		authenticator = new UserAuthenticator(password, name);
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

	@Override
	public boolean authenticate(String name, String password) {
		return this.authenticator.authenticate(name, password);
	}

	@Override
	public void setPassword(String password) {
		this.authenticator.setPassword(password);
		
	}
	
}
