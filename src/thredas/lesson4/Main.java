package thredas.lesson4;

public class Main {

	
	public static void main(String[] args) {
		Resource resource = new Resource();
		Thread thread1 = new Thread(new Task1(resource), "thread 1");
		Thread thread2 = new Thread(new Task2(resource), "thread 2");
		Thread cleaner = new Thread(new TaskClean(resource), "cleaner");
		thread1.start();
		thread2.start();
		cleaner.start();
	}
}
