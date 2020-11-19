package introduction.lesson6.inheritance.sample2;

public class App {

	
	public static void main(String[] args) {
		
		BonusController bonusController = new BonusController();
		
		Employee f = new Employee("456", "Renato", 1000.00);
		System.out.println("registration number: " + f.getRegistrationName());
		System.out.println("name: " + f.getName());
		System.out.println("salary: " + f.getSalary());
		System.out.println("bonus: " + f.getBonus());
		System.out.println("remuneration: " + f.getRemuneration());
		
		bonusController.register(f);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Manager g = new Manager("986543", "Lucas", 4000.00, "888888");
		
		System.out.println("registration number: " + g.getRegistrationName());
		System.out.println("name: " + g.getName());
		System.out.println("salary: " + g.getSalary());
		System.out.println("bonus: " + g.getBonus());
		System.out.println("remuneration: " + g.getRemuneration());
		System.out.println("password: " + g.getPassword());
		
		bonusController.register(g);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Engineer e = new Engineer("32312", "Mauricio", 7000.00);
		
		System.out.println("registration number: " + e.getRegistrationName());
		System.out.println("name: " + e.getName());
		System.out.println("salary: " + e.getSalary());
		System.out.println("bonus: " + e.getBonus());
		System.out.println("remuneration: " + e.getRemuneration());
		
		bonusController.register(e);
		
		
		System.out.println("\n--------------------------------------------------\n");
		
		Accountant c = new Accountant("4444", "Luiz", 3000.00);
		
		System.out.println("registration number: " + c.getRegistrationName());
		System.out.println("name: " + c.getName());
		System.out.println("salary: " + c.getSalary());
		System.out.println("bonus: " + c.getBonus());
		System.out.println("remuneration: " + c.getRemuneration());
		
		bonusController.register(c);
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("total of bonus");
		System.out.println(bonusController.getTotalBonus());
		
	}
}
