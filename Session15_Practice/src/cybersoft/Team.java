package cybersoft;

import java.util.ArrayList;
import java.util.List;

public class Team {

	List<Player> players = new ArrayList<Player>();

	public void addPlayer(Player player) {
		players.add(player);
	}

	public void displayTeam() {
		System.out.println("Danh sách đội tuyển bóng đá:");
		for (Player player : players) {
			System.out.println(player.getPosition() + ": " + player.getName() + " (Điểm kỹ năng: " + player.getSkillLevel() + ")");
		}
	}

	public int totalSkillLevel() {
		int total = 0;
		for (Player player : players) {
			total += player.getSkillLevel();
		}
		return total;
	}
}
