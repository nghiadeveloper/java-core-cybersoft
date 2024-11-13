package cybersoft;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankAccount() {
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Đã nạp tiền: " + amount + " vào tài khoản");
		} else {
			System.out.println("Số tiền nạp vào phải lớn hơn 0 VNĐ.");
		}
	}
	
	public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            this.balance -= amount;
            System.out.println("Đã rút tiền: " + amount);
        } else if (amount > this.balance) {
            System.out.println("Số dư trong tài khoản không đủ để rút tiền.");
        } else {
            System.out.println("Số tiền cần rút phải lớn hơn 0 VNĐ.");
        }
    }

	public void displayBalance() {
		System.out.println("Số dư tài khoản: " + this.balance);
	}

}
