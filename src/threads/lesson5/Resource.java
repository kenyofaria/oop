package threads.lesson5;

public class Resource {

	private boolean isClean = true;

	public void operation1() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			while (!isClean) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + " operation 1 - step 1");
			doOperation();
			System.out.println(name + " operation 1 - step 2");
			doOperation();
			System.out.println(name + " operation 1 - step 3");
			doOperation();
			System.out.println(name + " operation 1 - step 4");
			doOperation();
			isClean = false;
			System.out.println(name + " operation 1 - terminated");
			this.notifyAll();
		}
	}

	public void operation2() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			while (!isClean) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + " operation 2 - step 1");
			doOperation();
			System.out.println(name + " operation 2 - step 2");
			doOperation();
			System.out.println(name + " operation 2 - step 3");
			doOperation();
			System.out.println(name + " operation 2 - step 4");
			doOperation();
			System.out.println(name + " operation 2 - step 5");
			doOperation();
			isClean = false;
			System.out.println(name + " operation 2 - terminated");
			this.notifyAll();

		}
	}

	public void clean() {
		String name = Thread.currentThread().getName();

		synchronized (this) {
			if (!isClean) {
				System.out.println(name + " is cleaning up - step 1");
				doOperation();
				System.out.println(name + " is cleaning up - step 2");
				doOperation();
				System.out.println(name + " is cleaning up - step 3");
				doOperation();
				isClean = true;
				System.out.println(name + " clean - terminated");
			}
			this.notifyAll();
		}
	}

	private void doOperation() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
