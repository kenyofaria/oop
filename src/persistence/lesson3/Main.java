package persistence.lesson3;

import java.sql.SQLException;
import java.util.List;

import persistence.lesson3.entidade.Empresa;
import persistence.lesson3.dao.EmpresaDAO;

public class Main {
	
	
	private static void executaExclusao() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		try {
			empresaDAO.deleta("03.876.987/0001-89");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	private static void executaListagem() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> lista = empresaDAO.lista();
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
		//executaInsercao();
			//executaExclusao();
		
		System.out.println("\n\n-------------------- antes ----------------------");	
		executaListagem();
		
		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salva(new Empresa("20.298.200/0001-50", "UFRS"));
		
		
		
		System.out.println("\n\n-------------------- depois ----------------------");
		executaListagem();
			
	}


	
}
