package swing.test.jtable;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

	private static List<Aluno> lista = new ArrayList<Aluno>();
	
	static {
		lista.add(new Aluno("123", "leonardo"));
		lista.add(new Aluno("234", "wilson"));
		lista.add(new Aluno("345", "kenyo"));
		lista.add(new Aluno("456", "helena"));
		lista.add(new Aluno("567", "vitor"));
	}
	
	public List<Aluno> listaDeAlunos(){
		return lista;
	}
	public void adicionaAluno(Aluno aluno) {
		lista.add(aluno);
	}
}
