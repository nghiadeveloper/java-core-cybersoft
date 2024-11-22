package cybersoft;

public class BaiTap02 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 2: Quản lý đội bóng và chiến thuật
		 * - Mục tiêu: Sử dụng các lớp con và phương thức trừu tượng.
		 * - Yêu cầu:
		 * 		. Tạo lớp Player có các thuộc tính name, position, skill_level, và phương thức play() (trừu tượng, chưa định nghĩa).
		 * 		. Tạo các lớp con như Forward, Midfielder, và Defender kế thừa từ Player, mỗi lớp sẽ định nghĩa lại phương thức play() để mô tả chiến thuật chơi riêng của từng vị trí.
		 * 		. Tạo lớp Team để quản lý danh sách các cầu thủ, thêm phương thức display_team() để hiển thị danh sách cầu thủ theo từng vị trí, và total_skill_level() để tính tổng điểm kỹ năng của đội.
		 * 		. Tạo một đội bóng với các cầu thủ ở từng vị trí khác nhau và hiển thị đội hình cùng tổng điểm kỹ năng của đội
		 */

		Team team = new Team();

		team.addPlayer(new Forward("Nguyễn Tiến Linh", "Tiền đạo", 100));
		team.addPlayer(new Midfielder("Nguyễn Quang Hải", "Tiền vệ", 90));
		team.addPlayer(new Defender("Quế Ngọc Hải", "Hậu vệ", 95));

		team.displayTeam();

		System.out.println("Tổng điểm kỹ năng của đội tuyển quốc gia Việt Nam: " + team.totalSkillLevel());

		for (Player player : team.players) {
			player.play();
		}
	}

}
