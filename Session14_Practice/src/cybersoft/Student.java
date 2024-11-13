package cybersoft;

public class Student {

	private String name;
	private int age;
	private double[] grades;

	public Student(String name, int age, double[] grades) {
		this.name = name;
		this.age = age;
		this.grades = grades;
	}

	public Student() {
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

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public void calculateAverage() {
		if (grades.length < 0) {
			System.out.println("Error grades empty!");
		} else {
			double sum = 0;
			for (double grade : grades) {
				sum += grade;
			}
			double avg = sum / grades.length;
			System.out.println("Điểm trung bình: " + avg);
		}
	}

	public void getInfo() {
		System.out.println("Tên: " + this.name);
		System.out.println("Tuổi: " + this.age);
	}

}
