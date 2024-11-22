package cybersoft;

public class Forward extends Player {

	public Forward(String name, String position, int skillLevel) {
		super(name, position, skillLevel);
	}

	@Override
	public void play() {
		System.out.println(this.name + ": triển khai tấn công và ghi bàn");
	}

}
