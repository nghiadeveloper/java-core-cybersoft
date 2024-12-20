package cybersoft;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * 2) Tính đóng gói
		 * - Giới hạn quyền truy cập và sử dụng thuộc tính hoặc phương thức khai báo trong đối tượng
		 * 
		 * - Access modifier (phạm vi truy cập)
		 * 		+ Public: Thành phần công khai, truy cập tự do từ bên ngoài
		 * 		+ Private: Truy cập trong nội bộ class, có tác dụng khi viết thư viện
		 * 		+ Protected: Truy nhập bên trong package, package bên ngoài sử dụng kế thừa
		 * 		+ Default: Truy cập trong nội bộ package (mặc định) và bên trong class
		 * 
		 * - setter: hàm dùng để gán giá trị cho thuộc tính bên trong đối tượng
		 * - getter: hàm dùng để lấy giá trị của thuộc tính bên trong đối tượng
		 * 
		 * - Các dạng design pattern: Module Orientation, Onion Architecture
		 */

		NhanVien nhanVien = new NhanVien();
		nhanVien.setTenNhanVien("Nguyễn Hiếu Nghĩa");
		System.out.println(nhanVien.getTenNhanVien());
	}

}
