package cybersoft;

public class BaiTap05 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 5: Tạo lớp "Nhân viên" và lớp con (Employee và Manager)
		 * - Mục tiêu: Tìm hiểu tính kế thừa và đa hình
		 * - Yêu cầu:
		 * 		+ Tạo lớp Employee với các thuộc tính name (tên), age (tuổi), và salary (lương)
		 * 		+ Thêm phương thức display_info() để in ra thông tin nhân viên
		 * 		+ Tạo lớp Manager kế thừa từ Employee và thêm thuộc tính department (phòng ban)
		 * 		+ Ghi đè phương thức display_info() trong lớp Manager để in thêm thông tin về phòng ban
		 * 		+ Tạo đối tượng Employee và Manager, sau đó hiển thị thông tin
		 */

		Employee employee = new Employee();
		employee.setName("Nguyễn Văn A");
		employee.setAge(25);
		employee.setSalary(3950000.0);
		employee.displayInfo();

		System.out.println();

		Manager manager = new Manager();
		manager.setName("Nguyễn Hiếu Nghĩa");
		manager.setAge(25);
		manager.setSalary(5000000.0);
		manager.setDepartment("Phòng IT");
	
		System.out.println("Thông tin quản lý:");
		manager.displayInfo();

	}

}
