package hackerRank.dataStructures.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		Integer score1 = o1.score;
		Integer score2 = o2.score;
		int ans = score2.compareTo(score1);
		if (ans == 0) {
			ans = o1.name.compareTo(o2.name);
		}
		return ans;
	}
}
