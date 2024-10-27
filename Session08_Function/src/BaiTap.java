import java.util.Scanner;

public class BaiTap {
	
	public static void maxNum(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println("Số lớn nhất là: " + max);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số thứ 1: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số thứ 2: ");
		int b = scanner.nextInt();
		System.out.print("Nhập số thứ 3: ");
		int c = scanner.nextInt();
		
		maxNum(a, b, c);

	}

}
