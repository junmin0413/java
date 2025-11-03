package exam1013;

public class PartTimeEmployee extends Employee{
	private int hourRate;
	private int time;
	
	public PartTimeEmployee(String name, String employeeId, int time, int hourSalary) {
		super(name, employeeId);
		this.time = time;
		this.hourRate = hourSalary;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getHourRate() {
		return hourRate;
	}
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}

	@Override
	public int calculatePay() {
		return hourRate * time;
	}
}
