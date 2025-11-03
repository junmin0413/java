package exam1013;

public class BankAccountExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("junmin","111-222-333");
		BankAccount account2 = new BankAccount("minjun","222-111-555");
		
		System.out.println(BankAccount.getCount());
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int amount = account.withdrawl(5000);
		System.out.println(amount);
		System.out.println(account.getBalance());
		
		amount = account.withdrawl(6000);
		System.out.println(amount);
		System.out.println(account.getBalance());
	}
}
