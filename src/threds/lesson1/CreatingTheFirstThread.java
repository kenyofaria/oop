package threds.lesson1;

public class CreatingTheFirstThread {

	
	public static void main(String[] args) {
		Task task = new Task();
		Thread t = new Thread(task, "first--thread");
		t.start();
		
		
		System.out.println("Main process 1");
		System.out.println("Main process 2");
		System.out.println("Main process 3");
		System.out.println("Main process 4");
		System.out.println("Main process 5");
		System.out.println("Main process 6");
		System.out.println("Main process 7");
		System.out.println("Main process 8");
		System.out.println("Main process 9");
		System.out.println("Main process 10");
		System.out.println("Main process 11");
		System.out.println("Main process 12");
		System.out.println("Main process 13");
		System.out.println("Main process 14");
		System.out.println("Main process 15");
		System.out.println("Main process 16");
		System.out.println("Main process 17");
		System.out.println("Main process 18");
		System.out.println("Main process 19");
		System.out.println("Main process 20");
		
		
//		try {
//			Thread.sleep(40000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Main terminated");
	}
}
