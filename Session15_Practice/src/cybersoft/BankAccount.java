package cybersoft;

public abstract class BankAccount {

	protected String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankAccount() {
	}

	public abstract void withdraw(double amount);

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Đã nạp: " + amount + " vào tài khoản " + this.accountNumber);
	}

	public abstract void displayBalance();

}
