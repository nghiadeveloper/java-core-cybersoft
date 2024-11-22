package cybersoft;

public class EconomySeat extends Seat {

	public EconomySeat(String seatNumber, double price, String status) {
		super(seatNumber, price, status);
	}

	@Override
	public double calculateFinalPrice() {
		return this.price;
	}

}
