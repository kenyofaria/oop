package introduction.lesson6.inheritance.sample4;

public class Student implements Authenticatable {
	
	private String password;
	private String name;
	
	
	
	
	public Student(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}
	@Override
	public boolean authenticate(String name, String password) {
		if(this.name.equals(name) && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void setName(String name) {
		this.name = name;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
		// TODO Auto-generated method stub
		
	}
	
	
	

}
