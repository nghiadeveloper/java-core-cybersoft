package cybersoft;

public class BusinessSeat extends Seat {

	public BusinessSeat(String seatNumber, double price, String status) {
		super(seatNumber, price, status);
	}

	@Override
	public double calculateFinalPrice() {
		return price * 1.1;
	}

}
