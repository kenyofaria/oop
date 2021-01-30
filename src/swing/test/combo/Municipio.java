package swing.test.combo;

public class Municipio {

	private String uf;
	private String nome;
	
	public Municipio(String uf, String nome) {
		super();
		this.uf = uf;
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
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
	
}
