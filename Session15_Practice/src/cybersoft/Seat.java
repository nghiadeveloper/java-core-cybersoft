package cybersoft;

public abstract class Seat {
	protected String seatNumber;
	protected double price;
	protected String status;

	public Seat(String seatNumber, double price, String status) {
		this.seatNumber = seatNumber;
		this.price = price;
		this.status = status;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public abstract double calculateFinalPrice();

	public void bookSeat() {
		if (this.status.equals("trống")) {
			this.status = "đã đặt";
			System.out.println("Ghế " + this.seatNumber + " đã được đặt.");
		} else {
			System.out.println("Ghế " + this.seatNumber + " hiện không còn trống.");
		}
	}

}
