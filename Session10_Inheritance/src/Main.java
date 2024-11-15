
public class Main {

	public static void main(String[] args) {
		
		/**
		 * 1) Tính kế thừa (inheritance)
		 * - Khi class con kế thừa class cha thì class con sẽ sở hữu tất cả những thuộc tính và phương thức của class cha
		 * - override (ghi đè phương thức): kế thừa lại phương thức của class cha và viết logic mới cho class con
		 * - super: đại diện cho class cha đang kế thừa
		 * - extends: kế thừa
		 */	

		TruongNhom truongNhom = new TruongNhom();
		truongNhom.tenNhanVien = "Nguyễn Văn A";
		truongNhom.luong = 50000;
//		truongNhom.xuatNhanVien();
		truongNhom.tinhLuong();

		TruongPhong truongPhong = new TruongPhong();
		truongPhong.tenNhanVien = "Nguyễn Thị B";
		truongPhong.tenNhomQuanLy = "Nhóm A";
		truongPhong.luong = 100000;
//		truongPhong.xuatNhanVien();
//		truongPhong.xuatThongTinTruongNhom();
		truongPhong.tinhLuong();

	}

}
