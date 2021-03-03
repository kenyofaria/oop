package threads.lesson1;

public class ThreadSleepSample {	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("We are learning about threads in Java!!");
		Thread.sleep(60000);
		System.out.println("Programm terminated");
	}
}
