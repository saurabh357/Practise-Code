package String;

import java.util.*;

public class removeDuplicateChar {

	public static String remove(String str) {
		String temp = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (!(m.getValue() > 1)) {
				temp += m.getKey();
			}
		}
		char[] neww = temp.toCharArray();
		Arrays.sort(neww);

		return new String(neww);

	}

	public static void main(String[] args) {
		System.out.println(remove("saurabh"));

	}
}
