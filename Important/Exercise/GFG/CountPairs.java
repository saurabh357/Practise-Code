package GFG;

import java.util.*;

public class CountPairs {
	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
		int count = 0;
//		for (int i = 0; i < head1.size(); i++) {
//			for (int j = 0; j < head2.size(); j++) {
//				if (head1.get(i) + head2.get(j) == x) {
//					count++;
//				}
//			}
//		}
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < head1.size(); i++) {
			s.add(head1.get(i));
		}
		for (int i = 0; i < head2.size(); i++) {
			int temp = x - head2.get(i);
			if (s.contains(temp)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		LinkedList<Integer> arr1 = new LinkedList<>();
		for (int i = 1; i <= 6; i++) {
			arr1.add(i);
		}

		LinkedList<Integer> arr2 = new LinkedList<>();
		arr2.add(11);
		arr2.add(12);
		arr2.add(13);
		int x = 15;
		System.out.println(countPairs(arr1, arr2, x));
	}

}
