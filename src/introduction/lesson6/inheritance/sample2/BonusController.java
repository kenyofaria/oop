package introduction.lesson6.inheritance.sample2;

public class BonusController {

	private double totalBonus;
	
	public void register(Employee employee) {
		double bonus = employee.getBonus();
		totalBonus = totalBonus + bonus;
	}
	//se o salario do gerente foi maior ou igual a 5.000, este nao recebe gratificacao
//	public void registra (Gerente gerente) {
//		double gratificacao = gerente.getGratificacao();
//		somaGratificacoes = somaGratificacoes + gratificacao;
//	}
//	
//	public void registra(Engenheiro engenheiro) {
//		double gratificacao = engenheiro.getGratificacao();
//		somaGratificacoes = somaGratificacoes + gratificacao;
//	}
	
	public double getTotalBonus() {
		return totalBonus;
	}
	
}
