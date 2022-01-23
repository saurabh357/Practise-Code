package Arrays;

import java.util.*;

public class TwoSum {
	public static void two(int[] arr, int t) {
		List<Integer> list = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int temp = t - arr[i];
			if (!map.containsKey(temp)) {
				map.put(arr[i], i);
			} else {
				list.add(map.get(temp));
				list.add(i);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int target = 6;
		two(arr, target);
	}

}
