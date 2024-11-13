package cybersoft;

public class BaiTap03 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 3: Quản lý tài khoản ngân hàng (Bank Account)
		 * - Mục tiêu: Tìm hiểu về các phương thức khởi tạo và quản lý trạng thái đối tượng
		 * - Yêu cầu:
		 * 		+ Tạo lớp BankAccount với các thuộc tính: account_number (số tài khoản), balance (số dư)
		 * 		+ Thêm phương thức deposit(amount) để nạp tiền vào tài khoản và withdraw(amount) để rút tiền, nhưng không cho phép rút nếu số dư không đủ
		 * 		+ Thêm phương thức display_balance() để in ra số dư hiện tại
		 * 		+ Tạo một đối tượng BankAccount, thử nạp và rút tiền và hiển thị số dư
		 */

		BankAccount account = new BankAccount();

		account.setAccountNumber("123456789");
		account.setBalance(100000.0);

		// Hiển thị số dư ban đầu
		account.displayBalance();

		// Nạp tiền vào tài khoản
		account.deposit(400000.0);
		account.displayBalance();

		// Rút tiền từ tài khoản
		account.withdraw(200000.0);
		account.displayBalance();

		// Cố gắng rút nhiều hơn số dư hiện tại
		account.withdraw(1500000.0);
		account.displayBalance();
		
	}

}
