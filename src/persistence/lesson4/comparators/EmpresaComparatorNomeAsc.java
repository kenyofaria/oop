package persistence.lesson4.comparators;

import persistence.lesson4.entidade.Empresa;
import java.util.Comparator;

public class EmpresaComparatorNomeAsc implements Comparator<Empresa> {

	@Override
	public int compare(Empresa empresa1, Empresa empresa2) {
		return empresa1.getNome().compareTo(empresa2.getNome());
	}

}
