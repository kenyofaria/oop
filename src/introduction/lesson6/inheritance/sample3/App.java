package introduction.lesson6.inheritance.sample3;

public class App {

	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[10];
		
		BonusController bonusController = new BonusController();
		
		Employee d = new Designer("456", "Renato", 1000.00);
		System.out.println("registration number: " + d.getRegistrationNumber());
		System.out.println("name: " + d.getName());
		System.out.println("salary: " + d.getSalary());
		System.out.println("bonus: " + d.getBonus());
		System.out.println("remuneration: " + d.getRemuneration());
		
		employees[0] = d;
		
		bonusController.register(d);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Employee g = new Manager("986543", "Lucas", 4000.00, "888888");
		
		System.out.println("registration number: " + g.getRegistrationNumber());
		System.out.println("name: " + g.getName());
		System.out.println("salary: " + g.getSalary());
		System.out.println("bonus: " + g.getBonus());
		System.out.println("remuneration: " + g.getRemuneration());
		System.out.println("password: " + g.getPassword());
		
		employees[1] = g;
		
		bonusController.register(g);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Employee e = new Engineer("32312", "Mauricio", 7000.00);
		
		System.out.println("registration number: " + e.getRegistrationNumber());
		System.out.println("name: " + e.getName());
		System.out.println("salary: " + e.getSalary());
		System.out.println("bonus: " + e.getBonus());
		System.out.println("remuneration: " + e.getRemuneration());
		
		employees[2] = e;
		
		bonusController.register(e);
		
		
		System.out.println("\n--------------------------------------------------\n");
		
		Employee c = new Accountant("4444", "Luiz", 3000.00);
		
		System.out.println("registration number: " + c.getRegistrationNumber());
		System.out.println("name: " + c.getName());
		System.out.println("salary: " + c.getSalary());
		System.out.println("bonus: " + c.getBonus());
		System.out.println("remuneration: " + c.getRemuneration());
		
		
		employees[3] = c;
		
		bonusController.register(c);
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("Total of bonus");
		System.out.println(bonusController.getTotalBonus());
		
	}
}
