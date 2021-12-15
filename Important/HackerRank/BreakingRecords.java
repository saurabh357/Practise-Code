package HackerRank;

import java.util.*;

public class BreakingRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> occ = new ArrayList<>();
		List<Integer> High = new ArrayList<>();
		List<Integer> Low = new ArrayList<>();
		int max = scores.get(0);
		int min = scores.get(0);
		High.add(max);
		Low.add(min);
		int count1 = 0;
		int count = 0;
		for (int i = 1; i < scores.size(); i++) {
			if (scores.get(i) > max) {
				max = scores.get(i);
				High.add(max);
			} else {
				High.add(max);
			}
			if (scores.get(i) < min) {
				min = scores.get(i);
				Low.add(min);
			} else {
				Low.add(min);
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i < High.size(); i++) {
			if (High.get(i) != scores.get(0)) {
				if (!map.containsKey(High.get(i))) {
					map.put(High.get(i), 1);
				} else {
					map.put(High.get(i), map.get(High.get(i)) + 1);
				}
			}
		}
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 1; i < Low.size(); i++) {
			if (Low.get(i) != scores.get(0)) {
				if (!map1.containsKey(Low.get(i))) {
					map1.put(Low.get(i), 1);
				} else {
					map1.put(Low.get(i), map1.get(Low.get(i)) + 1);
				}
			}
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			count++;
		}

		for (Map.Entry<Integer, Integer> m1 : map1.entrySet()) {
			count1++;
		}
		occ.add(count);
		occ.add(count1);
		return occ;
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(4);
		li.add(21);
		li.add(36);
		li.add(10);
		li.add(28);
		li.add(35);
		li.add(5);
		li.add(24);
		li.add(42);
		System.out.println(breakingRecords(li));

	}

}
