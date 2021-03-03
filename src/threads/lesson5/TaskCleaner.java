package threads.lesson5;

public class TaskCleaner implements Runnable {

	private Resource resource;

	public TaskCleaner(Resource resource) {
		this.resource = resource;
		
	}
	
	@Override
	public void run() {
		while(true) {
			this.resource.clean();
		}
	}

}
