package cybersoft;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();

	public void addRoom(HotelRoom room) {
		hotelRooms.add(room);
	}

	public List<HotelRoom> searchRoom(int capacity) {
		List<HotelRoom> availableRooms = new ArrayList<>();
		for (HotelRoom room : hotelRooms) {
			if (room.getStatus().equals("trống") && room.getCapacity() >= capacity) {
				availableRooms.add(room);
			}
		}
		return availableRooms;
	}

	public double calculateRevenue() {
		double totalRevenue = 0;
		for (HotelRoom room : hotelRooms) {
			if (room.getStatus().equals("đã đặt")) {
				totalRevenue += room.getPricePerNight();
			}
		}
		return totalRevenue;
	}

}
