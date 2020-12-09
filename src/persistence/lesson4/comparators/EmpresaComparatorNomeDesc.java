package persistence.lesson4.comparators;

import persistence.lesson4.entidade.Empresa;
import java.util.Comparator;

public class EmpresaComparatorNomeDesc implements Comparator<Empresa> {

	@Override
	public int compare(Empresa empresa1, Empresa empresa2) {
		return empresa2.getNome().compareTo(empresa1.getNome());
	}
}
