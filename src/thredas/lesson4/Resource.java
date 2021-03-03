package thredas.lesson4;

public class Resource {

	public void operation1() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			System.out.println(name + " operation 1 - step 1");
			System.out.println(name + " operation 1 - step 2");
			System.out.println(name + " operation 1 - step 3");
			doSomeThing();
			System.out.println(name + " operation 1 - step 4");
			System.out.println(name + " operation 1 - step 5");
			System.out.println(name + " operation 1 - terminated");
		}
		
	}
	
	public void operation2() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			System.out.println(name + " operation 2 - step 1");
			doSomeThing();
			System.out.println(name + " operation 2 - step 2");
			doSomeThing();
			System.out.println(name + " operation 2 - step 3");
			doSomeThing();
			System.out.println(name + " operation 2 - step 4");
			doSomeThing();
			System.out.println(name + " operation 2 - step 5");
			doSomeThing();
			System.out.println(name + " operation 2 - terminated");
		}
	}
	
	public void clean() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			System.out.println(name + " is cleaning up - step 1");
			doSomeThing();
			System.out.println(name + " is cleaning up - step 2");
			doSomeThing();
			System.out.println(name + " is cleaning up - step 3");
			doSomeThing();
			System.out.println(name + " cleaning - terminated");
		}
	}

	private void doSomeThing() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
