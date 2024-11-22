package cybersoft;

public class BaiTap04 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 4: Hệ thống ngân hàng với các loại tài khoản khác nhau
		 * - Mục tiêu: Áp dụng kế thừa và đa hình để quản lý tài khoản ngân hàng.
		 * - Yêu cầu:
		 * 		. Tạo lớp BankAccount với các thuộc tính account_number, balance, và phương thức withdraw(amount) và deposit(amount)
		 * 		. Tạo các lớp con CheckingAccount và SavingsAccount kế thừa từ BankAccount. Mỗi lớp có quy tắc riêng cho rút tiền. 
		 * 			Ví dụ: CheckingAccount có thể cho phép số dư âm (với mức phí) trong khi SavingsAccount chỉ cho phép rút nếu đủ số dư.	
		 * 		. Tạo phương thức display_balance() để hiển thị số dư. Ghi đè phương thức này trong từng lớp con để hiển thị thêm các chi tiết như số tiền có thể rút trong tài khoản tiết kiệm
		 * 		. Tạo một vài tài khoản, thử rút tiền và nạp tiền vào các tài khoản này, sau đó hiển thị số dư.
		 */

		BankAccount checkingAccount = new CheckingAccount("123456789", 500000.0, 200000.0);
		BankAccount savingsAccount = new SavingsAccount("135792468", 300000.0);

		System.out.println("-- Số dư ban đầu: ");
		checkingAccount.displayBalance();
		savingsAccount.displayBalance();
		
		System.out.println();

		System.out.println("-- Nạp tiền: ");
		checkingAccount.deposit(100000);
		savingsAccount.deposit(50000);

		System.out.println("-- Số dư sau khi nạp tiền: ");
		checkingAccount.displayBalance();
		savingsAccount.displayBalance();
		
		System.out.println();

		System.out.println("-- Rút tiền: ");
		checkingAccount.withdraw(600000);
		savingsAccount.withdraw(350000);
		
		System.out.println("-- Số dư sau khi rút tiền: ");
		checkingAccount.displayBalance();
		savingsAccount.displayBalance();

	}

}
