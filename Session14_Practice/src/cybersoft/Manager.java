package cybersoft;

public class Manager extends Employee {

	private String department;

	public Manager(String name, int age, double salary, String department) {
		super(name, age, salary);
		this.department = department;
	}

	public Manager() {
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Tên phòng ban: " + this.department);
	}

}
