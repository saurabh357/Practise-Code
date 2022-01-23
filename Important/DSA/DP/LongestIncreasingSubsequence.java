package DP;

import java.util.*;

public class LongestIncreasingSubsequence {

	public static void longest(int[] arr, int n) {
		List<Integer> list = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] > arr[j]) {
					max = 5;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int n = arr.length;
		longest(arr, n);
	}
}
