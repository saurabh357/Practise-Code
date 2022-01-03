import java.util.*;

public class hurdleRace {
	public static int hurdleRace(int k, List<Integer> height) {
		int max = height.get(0);
		for (int i = 1; i < height.size(); i++) {
			if (max < height.get(i)) {
				max = height.get(i);
			}
		}
		int ans = max - k;
		if (ans < 0) {
			ans = 0;
		}

		return ans;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int[] arr = { 2, 5, 4, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(hurdleRace(7, list));
	}

}
