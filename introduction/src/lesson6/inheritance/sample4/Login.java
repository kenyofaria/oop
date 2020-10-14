package lesson6.inheritance.sample4;

public class Login {

	public void authenticate(Authenticatable user, String name, String password) {
		if(user.authenticate(name, password)) {
			System.out.println("successfull");
		}else {
			System.out.println("fail");
		}
	}
	
}
