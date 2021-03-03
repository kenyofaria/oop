package thredas.lesson4;

public class Task2 implements Runnable{
	
	private Resource resource;
	public Task2(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		this.resource.operation2();
	}
}
