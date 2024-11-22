package cybersoft;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private List<Seat> seats = new ArrayList<Seat>();

	public void addSeat(Seat seat) {
		seats.add(seat);
	}

	public void bookSeat(String seatNumber) {
		for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				seat.bookSeat();
				return;
			}
		}
		System.out.println("Ghế " + seatNumber + " không tìm thấy.");
	}

	public double calculateTotalRevenue() {
		double totalRevenue = 0;
		for (Seat seat : seats) {
			if (seat.getStatus().equals("đã đặt")) {
				totalRevenue += seat.calculateFinalPrice();
			}
		}
		return totalRevenue;
	}

}
