package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 6, 1, 15, 25, 28, 0 };
		insertionSort(arr);
	}
}
