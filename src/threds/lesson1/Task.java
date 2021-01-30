package threds.lesson1;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("This message is printing by my first thread");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread terminated");
	}

}
