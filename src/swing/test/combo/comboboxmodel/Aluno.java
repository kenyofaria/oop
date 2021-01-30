package swing.test.combo.comboboxmodel;

public class Aluno {

	private Long id;
	private String nome;
	
	
	
	public Aluno(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return this.nome;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Aluno) {
//			Aluno a = (Aluno) obj;
//			return (a.id.equals(this.id));
//		}
//		return false;
//	}
}
