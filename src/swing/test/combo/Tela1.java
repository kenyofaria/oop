package swing.test.combo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Tela1 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
//	private JComboBox<Aluno> cmbAlunos;
	
	
	private JComboBox<Municipio> cmbMunicipios;
	private JComboBox<String> cmbUfs;
	
//	private List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	private List<Municipio> listaDeMunicipios = new ArrayList<Municipio>();
	private List<String> listaDeUfs = new ArrayList<String>();
	
	public Tela1() {
		setLayout(null);
		setBounds(10, 10, 800, 600);
		
//		carregaComboAlunos();
		
//		cmbAlunos.setBounds(10, 10, 100, 30);
//		cmbAlunos.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(cmbAlunos.getSelectedItem());
//				
//			}
//		});
		
		
		cmbUfs = new JComboBox<String>();
		cmbUfs.setBounds(10, 70, 100, 30);
		carregaComboUfs();
		cmbUfs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				carregaComboMunicipios(cmbUfs.getSelectedItem().toString());
				
			}
		});
		cmbMunicipios = new JComboBox<Municipio>();
		cmbMunicipios.setBounds(10, 130, 300, 30);
		
		this.add(cmbUfs);
		this.add(cmbMunicipios);
//		this.add(cmbAlunos);
		setVisible(true);
	}
	
	//carregar a combo com dados vindos do banco de dados
	private void carregaComboUfs() {
		listaDeMunicipios.add(new Municipio("GO", "Inhumas"));
		listaDeMunicipios.add(new Municipio("GO", "Goianira"));
		listaDeMunicipios.add(new Municipio("GO", "Goiânia"));
		listaDeMunicipios.add(new Municipio("SP", "Campinas"));
		listaDeMunicipios.add(new Municipio("SP", "São José dos Campos"));
		
		
		for (Municipio municipio : listaDeMunicipios) {
			if(!listaDeUfs.contains(municipio.getUf())) {
				listaDeUfs.add(municipio.getUf());
			}
		}
		
		cmbUfs.addItem("--");
		for (String uf : listaDeUfs) {
			cmbUfs.addItem(uf);
		}
	}
	
	private void carregaComboMunicipios(String uf) {
		cmbMunicipios.removeAllItems();
		for (Municipio municipio : listaDeMunicipios) {
			if(municipio.getUf().equals(uf)) {
				cmbMunicipios.addItem(municipio);	
			}
		}
	}

//	private void carregaComboAlunos() {
//		listaDeAlunos.add(new Aluno(1L, "Thiago"));
//		listaDeAlunos.add(new Aluno(2L, "Arthur"));
//		listaDeAlunos.add(new Aluno(3L, "Sofia"));
//		
//		cmbAlunos = new JComboBox<>();
//		for (Aluno aluno : listaDeAlunos) {
//			cmbAlunos.addItem(aluno);
//		}
//	}
	
	public static void main(String[] args) {
		new Tela1();
	}
}
