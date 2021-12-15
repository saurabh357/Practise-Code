package HackerRank;

import java.util.HashMap;
import java.util.Map.Entry;

public class SockMerchant {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (Entry<Integer, Integer> Entry : map.entrySet()) {
			if (Entry.getValue() % 2 == 0) {
				int t = Entry.getValue() / 2;
				count += t;
			} else {
				int temp = (Entry.getValue() - 1) / 2;
				count += temp;
				temp = 0;
			}

		}

		System.out.println(count);
	}
}
