package swing.test.jtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTable grid;
	private JScrollPane scrollPane;
	
	private JTextField inputMatricula;
	private JTextField inputNome;
	private JButton button;
	
	private StudentService studentService;
	private MyTableModel model;
	
		
	public Main() {
		init();
	}
	
	private void init() {
		
		studentService = new StudentService();
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 800, 600);
		container = new JPanel();
		container.setLayout(null);
		this.add(container);

		model = new MyTableModel(studentService.listaDeAlunos());
		grid = new JTable(model);
		scrollPane = new JScrollPane(grid);
		scrollPane.setBounds(10, 10, 700, 100);
		
		inputNome = new JTextField();
		inputMatricula = new JTextField();
		
		inputMatricula.setBounds(10,400,100,30);
		inputNome.setBounds(130,400,200,30);
		
		button = new JButton("clique");
		button.setBounds(10, 300, 100, 30);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno(inputMatricula.getText().trim(), inputNome.getText().trim());
				//studentService.adicionaAluno(aluno);
				model.add(aluno);
			}
		});
		
		container.add(button);
		container.add(inputMatricula);
		container.add(inputNome);
		container.add(scrollPane);
		
		
//		JScrollPane build = new CustomStripedJTable()
//								.inPosition(10, 130)
//								.withDimensions(700, 100)
//								.usingModel(model)
//								.striped(true)
//								.build();
		JScrollPane scroll = new JScrollPane(grid);
		scroll.setBounds(10, 130, 600, 100);
		container.add(scroll);
		
		
		
		//container.add(grid);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new Main();
	}
	
}
