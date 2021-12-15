package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

	public static void main(String[] args) {

		List<Integer> candles = new ArrayList<>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(3);

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < candles.size(); i++) {
			if (!map.containsKey(candles.get(i))) {
				map.put(candles.get(i), 1);
			} else {
				map.put(candles.get(i), map.get(candles.get(i)) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				count = m.getValue();
			}
		}
		System.out.println(count);
	}

}
