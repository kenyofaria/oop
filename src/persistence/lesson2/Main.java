package persistence.lesson2;

import java.sql.SQLException;
import java.util.List;

import persistence.lesson2.entidade.Empresa;
import persistence.lesson2.dao.EmpresaDAO;

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
		Empresa empresa = new Empresa("17.287.234/0001-33", "UFMG");
		empresaDAO.salva(empresa);
	}
	
	public static void main(String[] args) throws SQLException {
			executaInsercao();
			//executaExclusao();
			executaListagem();
	}


	
}
