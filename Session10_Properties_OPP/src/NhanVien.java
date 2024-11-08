import java.time.LocalDate;
import java.util.Scanner;

public class NhanVien {

	String tenNhanVien;
	int tuoi;
	String gioiTinh;
	LocalDate ngaySinh;
	double luong;

	public NhanVien(String tenNhanVien, int tuoi, String gioiTinh, LocalDate ngaySinh, double luong) {
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.luong = luong;
	}

	public NhanVien() {
	}

	public void xuatNhanVien() {
		System.out.println("Tên nhân viên: " + this.tenNhanVien);
		System.out.println("Tuổi: " + this.tuoi);
		System.out.println("Giới tính: " + this.gioiTinh);
		System.out.println("Ngày sinh: " + this.ngaySinh);
	}

	public void tinhLuong() {
		System.out.println("Lương: " + this.luong);
	}

}
