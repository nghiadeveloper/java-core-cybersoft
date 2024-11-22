package cybersoft;

public class Laptop extends Product {

	private String processor;
	private int ram;

	public Laptop(int id, String name, double price, int quantity, String processor, int ram) {
		super(id, name, price, quantity);
		this.processor = processor;
		this.ram = ram;
	}

	public Laptop() {
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public void calculateDiscountedPrice(double discountRate) {
		double discount = (this.price * discountRate) / 100;
		System.out.println("Giảm giá: " + (this.price - discount - 5000));
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Processor: " + this.processor);
		System.out.println("Ram: " + this.ram);
	}
	
	public void tradeInProgram() {
		System.out.println("Có hỗ trợ thu cũ đổi mới");
	}

}
