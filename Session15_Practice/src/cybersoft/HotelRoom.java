package cybersoft;

public class HotelRoom {

	private String roomNumber;
	private int capacity;
	private double pricePerNight;
	private String status;

	public HotelRoom(String roomNumber, int capacity, double pricePerNight, String status) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
		this.status = status;
	}

	public HotelRoom() {
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void bookRoom() {
		if (this.status.equals("trống")) {
			this.status = "đã đặt";
			System.out.println("Phòng " + this.roomNumber + " đã được đặt.");
		} else {
			System.out.println("Phòng " + this.roomNumber + " hiện không còn trống.");
		}
	}

	public void checkout() {
		if (this.status.equals("đã đặt")) {
			this.status = "trống";
			System.out.println("Khách đã trả phòng " + this.roomNumber + ".");
		} else {
			System.out.println("Phòng " + this.roomNumber + " hiện không có khách.");
		}
	}

}
