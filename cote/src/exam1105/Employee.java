package exam1105;

public abstract class Employee {
	String name;
	String employeeId;
	
	public Employee() {
	}
	public Employee(String name, String employeeId) {
	}
	
	public abstract int calculatorPay();
}
