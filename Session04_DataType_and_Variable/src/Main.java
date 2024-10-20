import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Scope Code
		
		/**
		 * Lưu ý:
		 * - Đối với kiểu dữ liệu nguyên thủy: thì biến và giá trị sẽ được lưu trữ trong Stack Memory
		 * - Đối với kiểu dữ liệu tham chiếu: thì biến khai báo sẽ được lưu trữ trong Stack Memory và giá trị sẽ được lưu trữ trong Heap Memory
		 * - Stack Memory: Biến được giải phóng khi thoát khỏi scope code 
		 * - Heap Memory: Giá trị chỉ được giải phóng quá trình thu gom rác (Garbage Collection) chạy
		 */
		
//		int soA = 10;
//		int soC = soA;
//		boolean isSuccess = true;
//		{
//			
//			int soB = 5;
//			String chuoi = "CyberSoft";
//			String chuoi1 = chuoi;
//			System.out.println("Giá trị số a là: " + soA);
//			System.out.println("Giá trị số b là: " + soB);
//			System.out.println("Giá trị chuỗi là: " + chuoi1);
//		}
//		System.out.println("Giá trị số c là: " + soC);
		
		
		
//		Biến là hằng số (final) thì không thể thay đổi giá trị của biến trong quá trình xử lý
//		final int soE = 3;
		
		
		
//		Viết chương trình tính tổng 2 số mà người dùng nhập vào 
		
		/**
		 * Theo mô hình 3 khối
		 * - Đầu vào: Người dùng nhập vào 2 số từ bàn phím
		 * - Đâu ra: Tính tổng 2 số
		 * - Xử lý: Làm cách nào đó lấy 2 số người dùng nhập vào và tính tổng 2 số 
		 *     + Tạo ra 2 biến lưu trữ 2 giá trị mà người dùng nhập vào
		 *     + Tính tổng của 2 biến đó
		 *     + Xuất kết quả ra màn hình
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Vui lòng nhập số thứ 1: ");
//		int a = sc.nextInt();
		
//		System.out.print("Vui lòng nhập số thứ 2: ");
//		int b = sc.nextInt();
		
//		int kq = a + b;
//		System.out.println("Kết quả: " + kq);
		
		
		
//		Cách 1
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập tên của bạn: ");
//		String name = sc.nextLine();
//		System.out.println("Xin chào: " + name);
//		System.out.println("Cám ơn vì đã sử dụng chương trình này");

//		Cách 2
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên của bạn: ");
		String name = sc.nextLine();
		String hello = "Xin chào: " + name;
		System.out.println(hello);
		System.out.println("Cám ơn vì đã sử dụng chương trình này");

	}

}
