import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * Có 2 loại vòng lặp chính:
		 * 
		 * - Không biết code chạy bao nhiêu lần nhưng biết được điều kiện dừng vòng lặp
		 * 		+ while(điều kiện chạy lại code trong vòng lặp)
		 * 		+ do...while(điều kiện chạy lại code trong vòng lặp): chạy code bên trong vòng lặp rồi mới xét điều kiện
		 * 
		 * - Biết được số lần chạy code 
		 * 		+ for
		 */

		
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Vui lòng nhập điểm thi: ");
//		int diemThi = scanner.nextInt();
//		
//		// Khi nào điểm thi < 5 thì chạy code trong while
//		while(diemThi < 5) {
//			System.out.print("Vui lòng nhập điểm thi: ");
//			diemThi = scanner.nextInt();	
//		}
//		System.out.println("Điểm thi: " + diemThi);
		
		
		
//		// Cố tình vòng lặp vô tận
//		while(true) {
//			System.out.print("Vui lòng nhập điểm thi: ");
//			int diemThi = scanner.nextInt();
//			// Nếu điểm thi > 5 dùng break thoát khỏi vòng lặp
//			if(diemThi > 5) {
//				break;
//			}
//		}
		
		
//		int diemThi;
//		do {
//			System.out.print("Vui lòng nhập điểm thi: ");
//			diemThi = scanner.nextInt();
//		} while(diemThi > 5);
		
		
		
//		for(int i = 0; i < 5 ; i++) {
//			System.out.println("Hello Java " + i);
//			
//			for(int j = 0; j < 5 ; j++) {
//				System.out.println("Hello Java " + "i = " + i + " - j = " + j);
//			}
//		}
		
		
		
//		int soNgauNhien = (int)(Math.random() * 999 + 1);
//		System.out.println("Số ngẫu nhiên: " + soNgauNhien);
//		int soBanDoan;
//		do {
//			System.out.println("Nhập số bạn đoán: ");
//			soBanDoan = scanner.nextInt();
//			
//			if(soBanDoan < soNgauNhien) {
//				System.out.println("Bạn đang nhập số bé hơn");
//			} else if(soBanDoan < soNgauNhien) {
//				System.out.println("Bạn đang nhập số lớn hơn");
//			}
//		} while(soBanDoan != soNgauNhien);
//		System.out.println("Bạn đã đoán đúng");

		
		
		
//		Tạo ra mảng có 3 ô trống
		int mangA[] = new int[3];
		mangA[0] = 1;
		mangA[1] = 2;
		mangA[2] = 2;
		
		System.out.println("Mảng A[0] = " + mangA[0]);
		System.out.println("Mảng A[1] = " + mangA[1]);
		System.out.println("Mảng A[2] = " + mangA[2]);
        
	}

}
