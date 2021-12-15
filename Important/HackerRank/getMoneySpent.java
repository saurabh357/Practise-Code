package HackerRank;
import java.util.*;
public class getMoneySpent {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int n = keyboards.length, m = drives.length;
		List<Integer> li = new ArrayList<>();
		if (n == m) {
			if (keyboards[0] + drives[0] > b) {
				return -1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!(keyboards[i] + drives[j] > b)) {
					li.add(keyboards[i] + drives[j]);
				}
			}
		}
		Collections.sort(li, Collections.reverseOrder());
		return li.get(0);
	}

	public static void main(String[] args) {
		int[] keyboards = { 40, 50, 60 };
		int[] drives = { 5, 8, 12 };
		int b = 60;
		System.out.println(getMoneySpent(keyboards, drives, b));
	}
}