package threads.lesson5;

public class Main {

	
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Task1 task1 = new Task1(resource);
		Thread thread1 = new Thread(task1, "thread 1");
		
		Task2 task2 = new Task2(resource);
		Thread thread2 = new Thread(task2, "thread 2");
		
		TaskCleaner cleaner = new TaskCleaner(resource);
		Thread threadCleaner = new Thread(cleaner, "cleaner");
		threadCleaner.setDaemon(true);
		
		threadCleaner.start();
		thread1.start();
		thread2.start();
		
		
	}
}
