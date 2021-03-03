package threads.lesson2.solution;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JButton button1;
	private JLabel label;
	private JButton button2;
	
	public GUI() {
		this.setLayout(new GridLayout(1, 3));
		initializeGuiComponents();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	private void initializeGuiComponents() {
		this.setBounds(5, 5, 400, 80);
		this.button1 = new JButton("execute");
		this.label = new JLabel("elapsed time");
		this.button2 = new JButton("other button");
		this.add(this.button1);
		this.add(this.label);
		this.add(button2);
		this.button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					Runnable r = new Runnable() {
						@Override
						public void run() {
							for(long i=0; i<=1000000; i++) {
								System.out.println(Thread.currentThread().getName() + " executing task " + i);
							}
							label.setText("Process terminated");
						}
					};
					Thread t = new Thread(r,"task");
					t.start();
			}
		});
		this.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, Thread.currentThread().getName() + " button 2 clicked");
				
			}
		});
	}
	
}
