package cybersoft;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class NhanVien {

	private String tenNhanVien;
	int tuoi;
	protected String gioiTinh;
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
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
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
