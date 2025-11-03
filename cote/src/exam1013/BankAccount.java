package exam1013;

public class BankAccount {
	private static int count = 0;
	
	private String name;
	private String accountNumber;
	int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		count += 1;
	}
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		count += 1;
	}
	
	public static int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//출금, 출금액이 잔고보다 크면 잔고 만큼만 출금, balance 업데이트하고 최종 출금액 반환.
	public int withdrawl(int amount) {
		int finalAmount = amount;
		if(amount > balance) {
				finalAmount = balance;
		}
		balance -= finalAmount;
		return finalAmount;
	}
	
	//입금, balance 업데이트하고 최종 balance 반환.
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
}
