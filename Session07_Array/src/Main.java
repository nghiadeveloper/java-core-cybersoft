import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main {

	public static void main(String[] args) {

		int[] mangInt = new int[3];
		mangInt[0] =  4;
		mangInt[1] =  1;
		mangInt[2] =  2;
		System.out.println(mangInt[0]);
		
		String[] mangString = new String[3];
		mangString[1] = "Hello Array";
		System.out.println(mangString[0]);
		
		/**
		 * length: trả về tổng số lượng phần tử trong mảng
		 * 
		 * foreach: duyệt quâ từng phần tử của mảng cho đến hết. Không cần điều kiện dừng
		 * Cú pháp: for (kiểu_dữ_liệu tên_biến : mảng cần duyệt)
		 */
		
		System.out.println(mangInt.length);
		
//		For
		for (int i = 0; i < mangInt.length; i++) {
			System.out.println("Giá trị phần tử thứ " + i + " = " + mangInt[i]);	
		}

//		Foreach
		for (int item : mangInt) {
			System.out.println("Foreach: " + item);
		}
		
//		While
		int i = 0;
		while (i < mangInt.length) {
			System.out.println("While: " + mangInt[i]);
			i++;
		}
		
//		Danh sách (List)
//		List tenBien = new ArrayList<>(): Danh sách rỗng
//		Generic: <datatype>
//		.size(): đếm số lượng phần tử 
//		.add(giaTri): thêm phần tử vào danh sách
//		.remove(viTri): xóa phần tử trong danh sách
//		.get(viTri): xóa giá trị của phần tử chỉ định
		
		List<Integer> danhSach = new ArrayList<Integer>();
		danhSach.add(6);
		danhSach.add(3);
		danhSach.remove(0);
		
		System.out.println("Danh sách: " + danhSach.size());
		System.out.println("Danh sách: " + danhSach.get(0));
	}

}
