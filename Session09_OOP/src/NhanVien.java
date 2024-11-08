import java.time.LocalDate;

public class NhanVien {

	String tenNhanVien;
	int tuoi;
	String gioiTinh;
	LocalDate ngaySinh;

	public NhanVien(String tenNhanVien, int tuoi) {
		this.tenNhanVien = tenNhanVien; // <=> NhanVien.tenNhanVien = tenNhanVien
		this.tuoi = tuoi;
	}

	public NhanVien() {

	}

	void xuatNhanVien() {
		System.out.println("Tên nhân viên: " + tenNhanVien);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Ngày sinh: " + ngaySinh);
	}

}
