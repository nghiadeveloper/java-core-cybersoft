package cybersoft;

import java.time.LocalDate;

public class TruongNhom extends NhanVien {

	String tenNhomQuanLy;

	public void xuatThongTinTruongNhom() {
		System.out.println(tenNhomQuanLy);
	}

	@Override
	public void tinhLuong() {
		super.tinhLuong();
		double tongLuong = luong + 10000;
		System.out.println("Lương trưởng nhóm: " + tongLuong);
	}

}
