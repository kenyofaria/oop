package introduction.lesson10.gui.sample1;


//POJO
public class Student {

	private String name;
	private String address;
	private String number;
	
	public Student(String name, String address, String number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
