package cybersoft;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println("Đã rút: " + amount + " từ tài khoản Savings " + this.accountNumber);
		} else {
			System.out.println("Rút tiền không thành công. Không đủ số dư.");
		}

	}

	@Override
	public void displayBalance() {
		System.out.println("Số dư tài khoản Savings " + this.accountNumber + ": " + this.balance);
		System.out.printf("Số tiền có thể rút: " + this.balance);
	}

}
