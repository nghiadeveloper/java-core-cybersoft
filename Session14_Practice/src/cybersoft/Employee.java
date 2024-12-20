package cybersoft;

public class Employee implements NhanVien {

	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void displayInfo() {
		System.out.println("Tên nhân viên: " + this.name);
		System.out.println("Tuổi: " + this.age);
		System.out.println("Lương: " + this.salary);
	}

}
