/*
 Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.
input - 
5
1 2 1 3 2
3 2

 output - 2
 */

package HackerRank;

import java.util.*;

public class Birthday_Problem {
	public static int birthday(List<Integer> s, int d, int m) {
		int j = 1;
		int count = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s.size() == 1 && s.size() == m) {
				System.out.println("upper");
				return 1;

			}
			if (j == s.size()) {
				break;
			}

			if (s.get(i) + s.get(j) == d) {
				count++;
			}
			j++;
		}

		return count;

	}

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		s.add(4);
//		s.add(1);
//		s.add(1);
//		s.add(1);
//		s.add(1);
		int d = 4, m = 1;
		System.out.println(birthday(s, d, m));

	}

}