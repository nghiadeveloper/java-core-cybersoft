
public class Main {
	
	/**
	 * Function có 2 loại
	 * - Function có giá trị trả về
	 * 
	 * - Function không có giá trị trả về: Chỉ thực hiện code bên trong hàm
	 * 		+ Cú pháp: void tenFunction() { code }
	 * 		+ Sử dụng: tenFunction(tham số nếu có)
	 * 
	 * - Static: 
	 * 		+ Khi khai báo biến hoặc function có chứa từ khóa Static thì function đó nó sẽ được lưu trữ trên RAM (có thể sử dụng tất cả mọi nơi trong ứng dụng)
	 * 		+ Khi khai báo biến hoặc function không có từ khóa Static thì function đó nó sẽ được lưu trữ ở vùng nhớ khác
	 * 		+ Static sử dụng cho hằng số và các giá trị đơn giản
	 */
	
//	public static void TinhTong() {
//		int a = 10;
//		int b = 5;
//		int tong = a + b;
//		System.out.println("Tổng là: " + tong);
//	}
	
	
	
//	public static void TinhTong(int a, int b) {
//		int tong = a + b;
//		System.out.println("Tổng là: " + tong);
//	}
	
	
	
	public static int TinhTong(int a, int b) {
		int tong = a + b;
		System.out.println("Tổng là: " + tong);
		return tong;
	}

	public static void main(String[] args) {
		
		// Cách xem code của tên hàm: Nhấn giữ Ctrl và click chuột vào tên hàm
		TinhTong(10, 5);
		TinhTong(2, 3);
		
	}

}
