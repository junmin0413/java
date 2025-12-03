package exam1105;

public class PartTimeEmployee extends Employee{
	int hourly;
	int workHours;
	
	public PartTimeEmployee(int hourly, int workHours, String name, String employeeId) {
		super(name, employeeId);
		this.hourly = hourly;
		this.workHours = workHours;
	}
	
	@Override
	public int calculatorPay() {
		return hourly*workHours;
	}
}
