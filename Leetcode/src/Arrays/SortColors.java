package Arrays;

import java.util.*;

public class SortColors {
	public static void sort(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		int n = arr.length;
		sort(arr, n);
	}

}
