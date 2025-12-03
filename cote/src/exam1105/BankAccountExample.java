package exam1105;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount Account = new BankAccount("위","123", 5000);
		int fuc1 = Account.withdrawl(3000);
		int fun2 = Account.depsit(1000);
		System.out.println(fuc1);
		System.out.println(fun2);
	}

}

// 메소드 개념 정리!
// 객체 생성하는법.
// ~Example 더 공부하기.