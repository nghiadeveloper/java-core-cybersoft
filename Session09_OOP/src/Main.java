
public class Main {

	public static void main(String[] args) {
		
		/**
		 * - Bản chất của OOP là gom nhóm biến
		 * - Khởi tạo (sủ dụng) đối tượng: DataType_tenDoiTuong tenBien = new TenDoiTuong();
		 * - this = tên dối tượng
		 * - Overload (nạp chồng): Hàm cùng tên nhung khác nhau về số lượng tham số hoặc kiểu dữ liệu
		 */
		
		/**
		 * 4 tính chất của OOP
		 * - Tính kế thừa (inheritance)
		 * - Tính đóng gói (encapsulation)
		 * - Tính trừu tượng (abstract) 
		 * - Tính đa hình (polymorphism)
		 */
		
//		BaiViet baiViet1 = new BaiViet();
//		baiViet1.tieuDe = "Tiêu đề bài viết 1";
//		baiViet1.hinhAnh = "Hình ảnh bài viết 1";
//		baiViet1.noiDung = "Nội dung bài viết 1";
		
//		BaiViet baiViet2 = new BaiViet();
//		baiViet2.tieuDe = "Tiêu đề bài viết 2";
//		baiViet2.hinhAnh = "Hình ảnh bài viết 2";
//		baiViet2.noiDung = "Nội dung bài viết 2";
		
//		BaiViet baiViet3 = new BaiViet();
//		baiViet3.tieuDe = baiViet2.tieuDe;
//		baiViet3.hinhAnh = baiViet2.hinhAnh;
//		baiViet3.noiDung = baiViet2.noiDung;
		
//		System.out.println("Tiêu đề: " + baiViet1.tieuDe);
//		System.out.println("Hình ảnh: " + baiViet1.hinhAnh);
//		System.out.println("Nội dung: " + baiViet1.noiDung);
		
//		System.out.println("Tiêu đề: " + baiViet2.tieuDe);
//		System.out.println("Hình ảnh: " + baiViet2.hinhAnh);
//		System.out.println("Nội dung: " + baiViet2.noiDung);
		
//		NhanVien nhanVien = new NhanVien();
//		nhanVien.tenNhanVien = "Nguyễn Hiếu Nghĩa";
//		nhanVien.tuoi = 25;
//		nhanVien.gioiTinh = "Nam";
//		nhanVien.ngaySinh = "22-02-2000";
		
//		System.out.println("Tên nhân viên: " + nhanVien.tenNhanVien);
//		System.out.println("Tuổi: " + nhanVien.tuoi);
//		System.out.println("Giới tính: " + nhanVien.gioiTinh);
//		System.out.println("Ngày sinh: " + nhanVien.ngaySinh);
		
		NhanVien nhanVien = new NhanVien("Nguyễn Hiếu Nghĩa", 25);
		nhanVien.xuatNhanVien();
	
	}

}
