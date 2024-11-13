package cybersoft;

public class BaiTap02 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 2: Tạo lớp "Sinh viên" (Student)
		 * - Mục tiêu: Hiểu cách quản lý thuộc tính và các phương thức trong lớp
		 * - Yêu cầu:
		 * 		+ Tạo lớp Student với các thuộc tính: name (tên), age (tuổi) và grades (mảng điểm)
		 * 		+ Thêm phương thức calculate_average() để tính điểm trung bình
		 * 		+ Thêm phương thức get_info() để in ra thông tin sinh viên gồm tên, tuổi và điểm trung bình
		 * 		+ Tạo một đối tượng Student, gán giá trị cho các thuộc tính, và gọi các phương thức trên
		 */

		double[] grades = { 8.0, 9.0, 8.5 };

		Student student = new Student();
		student.setName("Nguyễn Hiếu Nghĩa");
		student.setAge(25);
		student.setGrades(grades);
		
		student.calculateAverage();
		student.getInfo();

	}

}
