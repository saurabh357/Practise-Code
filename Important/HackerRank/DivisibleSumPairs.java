package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>();
		ar.add(5);
		ar.add(9);
		ar.add(10);
		ar.add(7);
		ar.add(4);
		int n = 5, k = 2;
		System.out.println(divisibleSumPairs(n, k, ar));

	}

}