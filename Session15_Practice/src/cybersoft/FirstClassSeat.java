package cybersoft;

public class FirstClassSeat extends Seat {

	public FirstClassSeat(String seatNumber, double price, String status) {
		super(seatNumber, price, status);
	}

	@Override
	public double calculateFinalPrice() {
		return price * 1.2;
	}

}
