package lesson5.object.composition.sample1;

public class Course {
	
	private String code;
	private String name;
	private String period;
	
	public Course(String code, String name, String period) {
		this.code = code;
		this.name = name;
		this.period = period;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getPeriod() {
		return period;
	}

	@Override
	public String toString() {
		return code + " - " + name + " - " + period;
	}
	
	

}
