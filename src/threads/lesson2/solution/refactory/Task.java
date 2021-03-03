package threads.lesson2.solution.refactory;

import javax.swing.JLabel;

public class Task implements Runnable{

	
	private JLabel label;

	public Task(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void run() {
		for(long i=0; i<=1000000; i++) {
			System.out.println(Thread.currentThread().getName() + " executing task " + i);
		}
		label.setText("Process terminated");
	}

}
