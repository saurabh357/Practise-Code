	package Sorting;

import java.util.Arrays;

// Selections sort is algo where divided into two parts left and right left is sorted and right is unsorted

// LEFT  -  []
// RIGHT -  [10, 7, 8, 6, 1, 15, 25, 28, 0] 

public class SelectionSort {
	public static void selectionSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 6, 1, 15, 25, 28, 0 };
		selectionSort(arr);
	}
}
