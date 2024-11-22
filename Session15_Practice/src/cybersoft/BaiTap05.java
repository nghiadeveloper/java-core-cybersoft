package cybersoft;

public class BaiTap05 {

	public static void main(String[] args) {

		/**
		 * Bài tập 5: Hệ thống đặt vé máy bay với các loại ghế 
		 * - Mục tiêu: Áp dụng kế thừa, đa hình và các quy tắc đặc biệt cho từng loại ghế. 
		 * - Yêu cầu: 
		 * 		. Tạo lớp Seat với các thuộc tính seat_number, price, và status (trạng thái: “trống” hoặc “đã đặt”) 
		 * 		. Tạo các lớp con EconomySeat, BusinessSeat, và FirstClassSeat kế thừa từ Seat. Mỗi lớp có phương thức calculate_final_price() để tính giá cuối cùng với các phụ phí riêng.
		 * 			Ví dụ: BusinessSeat có phụ phí dịch vụ và FirstClassSeat có phụ phí cao hơn.
		 * 		. Tạo lớp Flight chứa danh sách các ghế và phương thức book_seat(seat_number) để đặt ghế theo số ghế và calculate_total_revenue() để tính tổng doanh thu của chuyến bay.
		 * 		. Tạo một chuyến bay với danh sách các loại ghế khác nhau, thử đặt ghế và tính doanh thu cuối cùng từ các ghế đã đặt.
		 */

		Flight flight = new Flight();

		flight.addSeat(new EconomySeat("E1", 100000, "trống"));
		flight.addSeat(new EconomySeat("E2", 300000, "đã đặt"));
		flight.addSeat(new BusinessSeat("B1", 200000, "trống"));
		flight.addSeat(new FirstClassSeat("F1", 500000, "trống"));

		System.out.println("Đặt ghế: ");
		flight.bookSeat("E1");
		flight.bookSeat("E2");
		flight.bookSeat("B1");

		System.out.println("Tổng doanh thu: ");
		double totalRevenue = flight.calculateTotalRevenue();
		System.out.printf("Tổng doanh thu từ các ghế đã đặt: %.2f\n", totalRevenue);

	}

}
