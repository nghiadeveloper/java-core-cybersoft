package cybersoft;

public class Smartphone extends Product {

	private String cameraQuality;

	public Smartphone(int id, String name, double price, int quantity, String cameraQuality) {
		super(id, name, price, quantity);
		this.cameraQuality = cameraQuality;
	}

	public Smartphone() {
	}

	public String getCameraQuality() {
		return cameraQuality;
	}

	public void setCameraQuality(String cameraQuality) {
		this.cameraQuality = cameraQuality;
	}

	@Override
	public void calculateDiscountedPrice(double discountRate) {
		double discount = (this.price * discountRate) / 100;
		System.out.println("Giảm giá: " + (this.price - discount - 10000));
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Camera quality: " + this.cameraQuality);
	}

}
