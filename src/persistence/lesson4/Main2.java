package persistence.lesson4;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import persistence.lesson4.entidade.Empresa;
import persistence.lesson4.comparators.EmpresaComparatorNomeAsc;
import persistence.lesson4.comparators.EmpresaComparatorNomeDesc;
import persistence.lesson4.dao.EmpresaDAO2;

public class Main2 {
	
	
	private static void executaListagemPeloNome() {
		EmpresaDAO2 empresaDAO = new EmpresaDAO2();
		List<Empresa> lista = empresaDAO.lista();
		System.out.println("lista igual ao banco de dados");
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("lista ordenada - crescente pelo nome");
		Collections.sort(lista, new EmpresaComparatorNomeAsc());
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("lista ordenada - decrescente pelo nome");
		Collections.sort(lista, new EmpresaComparatorNomeDesc());
		for (Empresa empresa : lista) {
			System.out.println(empresa.getCnpj() + "  " + empresa.getNome());
		}
	}
	
	public static void main(String[] args) throws SQLException {
		executaListagemPeloNome();
	}


	
}
