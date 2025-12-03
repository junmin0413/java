package exam1105;

public class FullTimeEmployee extends Employee{
	private int annualSalary;

	public FullTimeEmployee(String name, String employeeId, int annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public int calculatorPay() {
		return annualSalary/12;
	}
	
}
