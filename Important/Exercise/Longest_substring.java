import java.util.*;

class Longest_substring {
	public static void main(String[] args) {
		String str = "abcdab";
		char[] ch = str.toCharArray();

		int len = 0;
		String longLen = null;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (!m.containsKey(c)) {
				m.put(c, i);
			} else {
				i = m.get(c);
				m.clear();
			}
		}
		if (m.size() > len) {
			len = m.size();
			longLen = m.keySet().toString();
		}
		System.out.println(longLen);
	}
}