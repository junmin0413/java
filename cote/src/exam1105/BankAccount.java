package exam1105;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
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
	
	int withdrawl(int amount) {
		if(amount > balance) {
			return balance;
		}
		return balance - amount;
	}
	int depsit(int amount) {
		balance += amount;
		return balance;
	}
}
