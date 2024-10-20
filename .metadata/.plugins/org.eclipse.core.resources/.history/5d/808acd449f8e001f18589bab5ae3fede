import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập điểm toán: ");
		double diemToan = scanner.nextDouble();
		System.out.print("Nhập điểm lý: ");
		double diemLy = scanner.nextDouble();
		System.out.print("Nhập điểm hoá: ");
		double diemHoa = scanner.nextDouble();
		double diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
		
		if(diemTrungBinh >= 9 && diemTrungBinh <= 10) {
			System.out.println("Chúc mừng bạn " + hoTen + " học sinh xuất sắc");
		} else if(diemTrungBinh >= 8 && diemTrungBinh < 9) {
			System.out.println("Chúc mừng bạn " + hoTen + " học sinh giỏi");
		} else if(diemTrungBinh >= 7 && diemTrungBinh < 8) {
			System.out.println("Chúc mừng bạn " + hoTen + " học sinh khá");
		} else if(diemTrungBinh >= 6 && diemTrungBinh < 7) {
			System.out.println("Chúc mừng bạn " + hoTen + " học sinh tiên tiến");
		} else if(diemTrungBinh >= 5 && diemTrungBinh < 6) {
			System.out.println("Chia buồn cùng bạn " + hoTen + " học sinh trung bình");
		} else if(diemTrungBinh >= 4 && diemTrungBinh < 5) {
			System.out.println("Chia buồn cùng bạn " + hoTen + " học sinh yếu, bạn phải thi lại!");
		} else if(diemTrungBinh >= 3 && diemTrungBinh < 4) {
			System.out.println("Chia buồn cùng bạn " + hoTen + " ở lại lớp!");
		} else {
			System.out.println("Chưa có điểm");
		}
	}

}
