package threads.lesson5;

public class Task1 implements Runnable {

	private Resource resource;

	public Task1(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		this.resource.operation1();
	}

}
