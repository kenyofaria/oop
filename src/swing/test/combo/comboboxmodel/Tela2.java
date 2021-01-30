package swing.test.combo.comboboxmodel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Tela2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<Aluno> cmbAlunos;
	private Vector<Aluno> listaDeAlunos = new Vector<Aluno>();
	
	
	public Tela2() {
		
		setLayout(null);
		setBounds(10, 10, 800, 600);
		cmbAlunos = new JComboBox<Aluno>();
		cmbAlunos.setBounds(10, 10, 100, 30);
		cmbAlunos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((Aluno) cmbAlunos.getSelectedItem()).getId());
				
			}
		});
		carregaCombo();
		
		this.add(cmbAlunos);
		setVisible(true);
	}
	private void carregaCombo() {
		listaDeAlunos.add(new Aluno(1L, "Thiago"));
		listaDeAlunos.add(new Aluno(2L, "Arthur"));
		listaDeAlunos.add(new Aluno(3L, "Sofia"));
		for (Aluno aluno : listaDeAlunos) {
			cmbAlunos.addItem(aluno);
		}
	}
	
	public static void main(String[] args) {
		new Tela2();
	}
}
