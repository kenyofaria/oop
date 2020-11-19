package introduction.lesson6.inheritance.sample4;

public class Customer implements Authenticatable{
	
	private UserAuthenticator authenticator;
	public Customer(String name, String password) {
		super();
		this.authenticator = new UserAuthenticator(password, name);
	}

	@Override
	public boolean authenticate(String name, String password) {
		return this.authenticator.authenticate(name, password);
	}

	@Override
	public void setName(String name) {
		this.authenticator.setName(name);
		
	}

	@Override
	public void setPassword(String password) {
		this.authenticator.setPassword(password);
	}

}
