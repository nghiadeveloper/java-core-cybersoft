package cybersoft;

public class Defender extends Player {

	public Defender(String name, String position, int skillLevel) {
		super(name, position, skillLevel);
	}

	@Override
	public void play() {
		System.out.println(this.name + ": Hỗ trợ thủ môn để ngăn chặn đối phương tiếp cận khung thành và làm tung lưới đội nhà");

	}

}
