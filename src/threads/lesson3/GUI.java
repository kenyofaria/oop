package threads.lesson3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class GUI extends JFrame{
private static final long serialVersionUID = 1L;
	
	private JButton btn;
	private JProgressBar progress;
	
	private int stage = 0;
	
	public GUI(){
		init();
	}
	
	public void init() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(1024, 300);
		
		btn = new JButton("start process");
		btn.setBounds(10, 10, 200, 30);
		
		progress = new JProgressBar();
		progress.setBounds(10, 40, 800, 30);
		progress.setValue(stage);
		
		add(btn);
		add(progress);
		
		btn.addActionListener(listenerBtn());
		
		setVisible(true);
	}

	private ActionListener listenerBtn() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while(stage < 100) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					progress.setValue(stage);
					stage ++;
				}
			}
		};
	}
	
	
	
}
