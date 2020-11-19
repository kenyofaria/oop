package introduction.lesson10.gui.sample1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tela extends JFrame{

	private JTextField inputName;
	private JTextField inputAddress;
	private JTextField inputNumber;
	private JButton buttonOK;
	private JTable table;
	
	private ArrayList<Student> students = new ArrayList<>();
	private JScrollPane scrollPane;
	private MyModel myModel;
	
	
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(10, 10, 800, 600);
		
		inputName = new JTextField();
		inputName.setBounds(100, 50, 300, 30);
		
		inputAddress = new JTextField();
		inputAddress.setBounds(100, 90, 350, 30);
		
		inputNumber = new JTextField();
		inputNumber.setBounds(455, 90, 90, 30);
		
		buttonOK = new JButton("OK");
		buttonOK.addActionListener(listenerOfButton());
		buttonOK.setBounds(100, 130, 100, 30);

		myModel = new MyModel(students);
		table = new JTable(myModel);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(100, 170, 450, 200);
		
		this.add(inputName);
		this.add(inputAddress);
		this.add(inputNumber);
		this.add(buttonOK);
		this.add(scrollPane);
	}
	
	
	private ActionListener listenerOfButton() {
		ActionListener myListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(inputName.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(Tela.this, "o campo nome é obrigatório", "campo obrigatório", JOptionPane.WARNING_MESSAGE);
				}else {
					students.add(new Student(inputName.getText().trim(), inputAddress.getText().trim(), inputNumber.getText().trim()));
					myModel.fireTableDataChanged();
					inputName.setText("");
					inputAddress.setText("");
					inputNumber.setText("");
				}
				
				
			}
		};
		return myListener;
	}


	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);
	}
}
