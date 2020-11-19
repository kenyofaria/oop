package introduction.lesson6.inheritance.sample1;

public class App {

	
	public static void main(String[] args) {
		
//		Funcionario funcionario = new Funcionario();
//		funcionario.setMatricula("9191919");
//		funcionario.setNome("Kenyo");
//		funcionario.setSalario(1000.00);
//		
//		
//		System.out.println("matricula: " + funcionario.getMatricula());
//		System.out.println("nome: " + funcionario.getNome());
//		System.out.println("salario: " + funcionario.getSalario());
//		System.out.println("gratificacao: " + funcionario.getGratificacao());
//		System.out.println("remuneracao: " + funcionario.getRemuneracao());
		
		
		Employee f = new Employee("456", "Renato", 5000.00);
		System.out.println("registration number: " + f.getRegistrationNumber());
		System.out.println("name: " + f.getName());
		System.out.println("salary: " + f.getSalary());
		System.out.println("bonus: " + f.getBonus());
		System.out.println("remuneration: " + f.getRemuneration());
		
		System.out.println("\n--------------------------------------------------\n");
		
		Manager g = new Manager("986543", "Lucas", 7000.00, "888888");
		
		System.out.println("registration number: " + g.getRegistrationNumber());
		System.out.println("name: " + g.getName());
		System.out.println("salary: " + g.getSalary());
		System.out.println("bonus: " + g.getBonus());
		System.out.println("remuneration: " + g.getRemuneration());
		System.out.println("password: " + g.getPassword());
		
		
//		Gerente gerente = new Gerente();
//		gerente.setMatricula("3432");
//		gerente.setNome("Vitor");
//		gerente.setSalario(3000.00);
//		gerente.setSenha("123456");
//		
//		System.out.println("matricula: " + gerente.getMatricula());
//		System.out.println("nome: " + gerente.getNome());
//		System.out.println("salario: " + gerente.getSalario());
//		System.out.println("gratificacao: " + gerente.getGratificacao());
//		System.out.println("remuneracao: " + gerente.getRemuneracao());
//		System.out.println("senha: " + gerente.getSenha());
		
	}
}
