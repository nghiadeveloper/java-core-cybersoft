package cybersoft;

public class Midfielder extends Player {

	public Midfielder(String name, String position, int skillLevel) {
		super(name, position, skillLevel);
	}

	@Override
	public void play() {
		System.out.println(this.name + ": Đoạt bóng từ đối phương, phát động tấn công để đưa bóng lên cho tiền đạo và ghi bàn");
	}

}
