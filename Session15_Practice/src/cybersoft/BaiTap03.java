package cybersoft;

import java.util.List;

public class BaiTap03 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 3: Hệ thống đặt phòng khách sạn
		 * - Mục tiêu: Thực hành các khái niệm quản lý trạng thái và sử dụng các lớp lồng nhau.
		 * - Yêu cầu:
		 * 		. Tạo lớp HotelRoom có các thuộc tính room_number, capacity, price_per_night, và status (trạng thái: “trống” hoặc “đã đặt”).
		 * 		. Thêm phương thức book_room() để đặt phòng (đổi trạng thái thành “đã đặt”) và checkout() để trả phòng.
		 * 		. Tạo lớp Hotel chứa danh sách các phòng. Thêm phương thức search_room(capacity) để tìm phòng trống theo sức chứa yêu cầu và phương thức calculate_revenue() để tính tổng thu nhập của khách sạn từ các phòng đã đặt.
		 * 		. Tạo một khách sạn với danh sách các phòng, thử đặt phòng và trả phòng, rồi tính toán doanh thu 
		 */

		Hotel hotel = new Hotel();

		hotel.addRoom(new HotelRoom("101", 2, 50000.0, "trống"));
		hotel.addRoom(new HotelRoom("102", 4, 80000.0, "trống"));
		hotel.addRoom(new HotelRoom("103", 1, 30000.0, "đã đặt"));

		// Tìm kiếm phòng cho 2 người
		List<HotelRoom> availableRooms = hotel.searchRoom(2);
		System.out.println("Phòng trống cho 2 người:");
		for (HotelRoom room : availableRooms) {
			System.out.println("Phòng số: " + room.getRoomNumber() + ", Giá: " + room.getPricePerNight());
		}

		// Đặt một phòng đầu tiên trong danh sách
		if (!availableRooms.isEmpty()) {
			availableRooms.get(0).bookRoom();
		}

		System.out.println("Tổng doanh thu: " + hotel.calculateRevenue());

		// Trả phòng
		if (!availableRooms.isEmpty()) {
			availableRooms.get(0).checkout();
		}

		// Kiểm tra doanh thu sau khi trả phòng
		System.out.println("Tổng doanh thu sau khi trả phòng: " + hotel.calculateRevenue());

	}

}
