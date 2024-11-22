package cybersoft;

public class Product {

	protected int id;
	protected String name;
	protected double price;
	protected int quantity;

	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void calculateDiscountedPrice(double discountRate) {
		double discount = (this.price * discountRate) / 100;
		System.out.println("Giảm giá: " + (this.price - discount));
	}

	public void displayInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity: " + this.quantity);
	}

}
