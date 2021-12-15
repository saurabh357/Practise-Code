package HackerRank;

import java.util.*;

public class MigratoryBirds {
	public static int migratoryBirds(List<Integer> arr) {

		int[] array = new int[5];
		for (int i = 0; i < arr.size(); i++) {
			array[arr.get(i) - 1]++;
		}
		// 0 1 2 3 4
		// array = [1 0 1 3 1 ]
		int max = 0;
		int ans = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				ans = i + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		System.out.println(migratoryBirds(arr));

	}

}