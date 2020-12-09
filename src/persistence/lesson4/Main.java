package persistence.lesson4;

import java.sql.SQLException;
import java.util.List;

import persistence.lesson4.entidade.Empresa;
import persistence.lesson4.dao.EmpresaDAO;

public class Main {
	
	
	private static void executaExclusao() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		try {
			empresaDAO.deleta("03.876.987/0001-89");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	private static void executaListagemPeloNome() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> lista = empresaDAO.listaAscByNome(); 
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
	}
	
	private static void executaListagemPeloCnpj() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> lista = empresaDAO.listaAscByCnpj(); 
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
	}

	private static void executaListagemPeloNomeDesc() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> lista = empresaDAO.listaDescByNome();
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
	}
	
	private static void executaInsercao() throws SQLException {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		Empresa empresa = new Empresa("05.123.876/0001-09", "UFG");
		empresaDAO.salva(empresa);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println("lista ordenada pelo nome crescente");
		executaListagemPeloNome();
		System.out.println("\n\nlista ordenada pelo nome decrescente");
		executaListagemPeloNomeDesc();
		System.out.println("\n\nlista ordenada pelo cnpj");
		executaListagemPeloCnpj();
	}


	
}
