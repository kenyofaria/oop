package lesson6.inheritance.sample4;

public class BonusController {

	private double totalBonus;
	
	public void register(Employee employee) {
		double bonus = employee.getBonus();
		totalBonus = totalBonus + bonus;
	}
	
	public double getTotalBonus() {
		return totalBonus;
	}
	
}
