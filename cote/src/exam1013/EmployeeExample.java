package exam1013;

public class EmployeeExample {
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("junmin","123456", 400);
		emps[1] = new PartTimeEmployee("minjun","654321", 20, 160);
		
		for(int i = 0; i < emps.length; i++) {
			String msg = emps[i].getName() + ","+ emps[i].calculatePay();
			System.out.println(msg);
		}
	}
}
