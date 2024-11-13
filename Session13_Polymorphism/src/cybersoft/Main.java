package cybersoft;

public class Main {

	private static String tenNhomQuanLy;

	public static void main(String[] args) {

		/**
		 * 4) Tính đa hình
		 * - Định nghĩa / khai báo hàm (không xử lý logic code)
		 * - Khai báo biến được nhưng biến đó phải là hằng số
		 * - implements: kế thừa interface
		 */
		
//		NhanVien nv = new NhanVien();
//		nv.setTenNhanVien("Nguyễn Hiếu Nghĩa");
//		nv.chamCong();
//		System.out.println("Kiểm tra: " + nv.getTenNhanVien());
		
		
		
		NhanVien truongNhom= new TruongNhom();
//		truongNhom.setTenNhanVien("Đa hình NhanVien - TruongNhom");
//		TruongNhom nhomDaEpKieu = (TruongNhom) truongNhom;
//		System.out.println("Kiểm tra: " + nhomDaEpKieu.getTenNhanVien());
		truongNhom.luong = 5000;
		truongNhom.tinhLuong();
		
		
		
		TinhNang tnTruongPhong = new TruongPhong();
		TinhNang tnTruongNhom = new TruongNhom(); // Dependence Injection
		tnTruongNhom.chamCong();
		
		
		
		NhanVien truongPhong = new TruongPhong();

	}

}
