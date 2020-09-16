package lesson5.object.composition.sample1;

public class City {
	
	private String name;
	private String code;
	private String state;
	
	public City(String name, String code, String state) {
		this.name = name;
		this.code = code;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getState() {
		return state;
	}
	
	
	@Override
	public String toString() {
		return name + "-" + state;
	}
}
