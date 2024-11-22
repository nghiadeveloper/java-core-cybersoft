package cybersoft;

public class Tablet extends Product {

	private String displaySize;

	public Tablet(int id, String name, double price, int quantity, String displaySize) {
		super(id, name, price, quantity);
		this.displaySize = displaySize;
	}

	public Tablet() {
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public void calculateDiscountedPrice(double discountRate) {
		double discount = (this.price * discountRate) / 100;
		System.out.println("Giảm giá: " + (this.price - discount));
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Display size: " + this.displaySize);
	}

}
