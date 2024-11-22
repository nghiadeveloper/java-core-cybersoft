package cybersoft;

import java.util.ArrayList;
import java.util.List;

public class BaiTap01 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 1: Hệ thống quản lý cửa hàng điện tử
		 * - Mục tiêu: Tìm hiểu về kế thừa và đa hình trong hệ thống quản lý sản phẩm
		 * - Yêu cầu: 
		 * 		. Tạo lớp Product có các thuộc tính cơ bản như id, name, price, và quantity.
		 * 		. Tạo các lớp con như Laptop, Smartphone, và Tablet, kế thừa từ Product. Mỗi lớp có thêm các thuộc tính riêng biệt, ví dụ: Laptop có processor và ram; Smartphone có camera_quality.
		 * 		. Thêm phương thức calculate_discounted_price(discount_rate) trong lớp Product để tính giá sau khi giảm giá. Phương thức này sẽ được ghi đè ở các lớp con để tính theo cách riêng của từng loại sản phẩm.
		 * 		. Tạo một danh sách các sản phẩm trong cửa hàng, sau đó hiển thị thông tin chi tiết và giá đã giảm cho từng loại sản phẩm.
		 */

		// instanceof: kiểm tra xem phương thức khởi tạo của biến hay của đối tượng là phương thức khởi tạo nào

		List<Product> listProducts = new ArrayList<Product>();

		Laptop laptop = new Laptop();
		laptop.setId(1);
		laptop.setName("Laptop HP Probook 460");
		laptop.setPrice(12000000);
		laptop.setQuantity(20);
		laptop.setProcessor("Core i9");
		laptop.setRam(32);

		Smartphone smartPhone = new Smartphone();
		smartPhone.setId(2);
		smartPhone.setName("Iphone 16");
		smartPhone.setPrice(12000000);
		smartPhone.setQuantity(10);
		smartPhone.setCameraQuality("12MP");

		Tablet tablet = new Tablet();
		tablet.setId(3);
		tablet.setName("Ipad Gen 9");
		tablet.setPrice(10000000);
		tablet.setQuantity(20);
		tablet.setDisplaySize("10 inch");

		listProducts.add(laptop);
		listProducts.add(smartPhone);
		listProducts.add(tablet);
		
		int length = listProducts.size();
		for(int i = 0; i < length; i++) {
			if("Iphone 16".equals(listProducts.get(i).getName())) {
				listProducts.remove(i);
			}
		}

		for (Product product : listProducts) {
			product.displayInfo();
			product.calculateDiscountedPrice(90);

			if (product instanceof Laptop) {
				Laptop newLaptop = (Laptop) product;
				newLaptop.tradeInProgram();
			}
		}

	}

}
