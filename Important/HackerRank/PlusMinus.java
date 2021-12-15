package HackerRank;

import java.util.*;

public class PlusMinus {
	public static void plusMinus(List<Integer> arr) {
		int n = arr.size();
		double count1 = 0;
		double count2 = 0;
		double count3 = 0;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) > 0) {
				count3++;
			} else if (arr.get(i) < 0) {
				count2++;
			} else {
				count1++;
			}
		}
		double f = count3 / n;
		System.out.printf("%.5f\n", count3 / n);
		double f1 = count2 / n;
		System.out.printf("%.5f\n", f1);
		double f2 = count1 / n;
		System.out.printf("%.5f", f2);
		return;
	}

	public static void main(String[] args) {
		int[] arr1 = { -4, 3, -9, 0, 4, 1 };
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			arr.add(arr1[i]);
		}
		plusMinus(arr);
	}

}
