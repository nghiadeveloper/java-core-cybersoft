package cybersoft;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount() {
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance + this.overdraftLimit >= amount) {
			this.balance -= amount;
			System.out.println("Đã rút: " + amount + " từ tài khoản Checking " + this.accountNumber);
		} else {
			System.out.println("Rút tiền không thành công. Số tiền vượt quá giới hạn.");
		}
	}

	@Override
	public void displayBalance() {
		System.out.println("Số dư tài khoản Checking " + this.accountNumber + ": " + this.balance);

	}

}
