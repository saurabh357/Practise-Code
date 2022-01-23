import java.util.*;

public class MinimumAddition {

	public static List<List<Integer>> groupSort(List<Integer> arr) {
		List<List<Integer>> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			if (map.containsKey(arr.get(i))) {
				map.put(arr.get(i), map.get(arr.get(i)) + 1);
			} else {
				map.put(arr.get(i), 1);
			}
		}
		List<Integer> temp = new ArrayList<>();
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			temp.add(m.getValue());
			List<Integer> l = new ArrayList<>();
			l.add(m.getKey());
			l.add(m.getValue());
			list.add(l);
		}
		// {{3,1},{7,1},{12,1}}
		return list;
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(7);
		l.add(12);
		System.out.println(groupSort(l));
	}
}
