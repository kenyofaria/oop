package introduction.lesson6.inheritance.sample4;

public class UserAuthenticator {

	private String password;
	private String name;
	
	
	public UserAuthenticator() {
		// 
	}
	
	public UserAuthenticator(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}

	public boolean authenticate(String name, String password) {
		if(this.name.equals(name) && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
