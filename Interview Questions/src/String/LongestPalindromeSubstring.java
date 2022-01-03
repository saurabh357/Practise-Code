/*
Input: s = "babad"
Output: "bab"

Explanation: "aba" is also a valid answer.

Input: s = "cbbd"
Output: "bb"
*/

package String;

import java.util.*;

public class LongestPalindromeSubstring {

	public boolean pal(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	public String longPal(String str) {

		String temp = "";
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length() - 1; j > i; j--) {
				temp = str.substring(i, j);
				if (pal(temp) == true) {
					if (temp.length() > 1) {
						list.add(temp);
					}
				}
				temp = "";
			}
		}
		String tempp = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (tempp.length() < list.get(i).length()) {
				tempp = list.get(i);
			}
		}
		return tempp;
	}

	public static void main(String[] args) {
		LongestPalindromeSubstring l = new LongestPalindromeSubstring();
		System.out.print(l.longPal("forgeeksskeegfor"));
	}
}
