package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LonelyInteger {
	public static void main(String[] args) {
		int[] arr = {4, 9, 95, 93, 57, 4, 57, 93, 9};
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}

}
