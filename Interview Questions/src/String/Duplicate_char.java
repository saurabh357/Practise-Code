package String;

import java.util.HashMap;

public class Duplicate_char {

	public static String dup(String str) {

		String ans = "";
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					map.put(str.charAt(i), count++);
				}
			}
		}
		System.out.println(map);
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(dup("saurabh kamra"));

	}

}
