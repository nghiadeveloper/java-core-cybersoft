import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Tạo re một mảng có 5 phần tử và cho người dùng nhập và các giá trị của 5 phần tử. 
		 * Xuất ra các giá trị đã nhập
		 */
		
		Scanner scanner = new Scanner(System.in);
        
//		Cách 1: Array
        
//		int[] array = new int[5];
	    
//		System.out.println("Nhập vào 5 phần tử:");
//		for (int i = 0; i < array.length; i++) {
//		    System.out.print("Phần tử " + (i + 1) + ": ");
//		    array[i] = scanner.nextInt();
//		}
//		
//		System.out.println("Các phần tử đã nhập:");
//		for (int value : array) {
//		    System.out.println("Giá trị: " + value);
//		}
//		
//		System.out.println("Các phần tử chia hết cho 2:");
//		for (int i = 0; i < array.length; i++) {
//			if(array[i] % 2 == 0) {
//				System.out.println("Các số chia hết cho 2: " + array[i] + " ở vị trí thứ " + i);
//			}
//		}
        
        
        
//		Cách 2: List
        
		List<Integer> danhSach = new ArrayList<Integer>();
		   
		System.out.println("Vui lòng nhập số lượng phần tử: ");
		int arraySize = scanner.nextInt();
		
		System.out.println("Nhập các phần tử: ");
		for (int i = 0; i < arraySize; i++) {
		    System.out.print("Phần tử " + (i + 1) + ": ");
		    danhSach.add(scanner.nextInt());
		}
		
		System.out.println("Các phần tử đã nhập:");
		for (int value : danhSach) {
		    System.out.println("Giá trị: " + value);
		}
		
		System.out.println("Các phần tử chia hết cho 2:");
		for (int i = 0; i < arraySize; i++) {
			if(danhSach.get(i) % 2 == 0) {
				System.out.println("Các số chia hết cho 2: " + danhSach.get(i) + " ở vị trí thứ " + i);
			}
		}
        
	}

}
