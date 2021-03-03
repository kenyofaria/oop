package thredas.lesson4;

public class TaskClean implements Runnable{
	
	private Resource resource;
	public TaskClean(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		this.resource.clean();
	}
}
