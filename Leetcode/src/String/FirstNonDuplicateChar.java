// My Solution My Logic

package String;

import java.util.*;

public class FirstNonDuplicateChar {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		char c = '\0';
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				continue;
			} else {
				c = m.getKey();
				break;
			}
		}
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				ans = i;
				break;
			}
		}
		System.out.println(c + " " + ans + 1);
	}
}