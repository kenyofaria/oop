package lesson6.inheritance.sample4;

public class App {

	
	public static void main(String[] args) {
	
		Authenticatable manager = new Manager("987987", "Kenyo", 20000, "123");
		
		Login login = new Login();
		login.authenticate(manager, "Kenyo", "123");
		
		Authenticatable cfo = new Cfo("8374872", "joao", 40000, "333");
		login.authenticate(cfo, "joao", "333");
//	
		Authenticatable customer = new Customer("adriana","999");
		login.authenticate(customer, "adriana", "999");
//		
//		Authenticatable student = new Student("777", "rodrigo");
//		login.authenticate(student, "rodrigo", "777");
				
		
	}
}
