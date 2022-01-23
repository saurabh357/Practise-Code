package Sorting;

import java.util.Arrays;

class MergeSort {

	public static void merge(int[] arr, int si, int mid, int ei) {
		int[] temp = new int[ei - si + 1];
		int index1 = si; // 5 3 8 6 1 9 25
		int index2 = mid + 1;
		int j = 0;

		while ((index1 <= mid) && (index2 <= ei)) {
			if (arr[index1] <= arr[index2]) {
				temp[j++] = arr[index1++];
			} else {
				temp[j++] = arr[index2++];
			}
		}
		while (index1 <= mid) {
			temp[j++] = arr[index1++];
		}
		while (index2 <= ei) {
			temp[j++] = arr[index2++];
		}
		for (int i = 0, k = si; i < temp.length; i++, k++) {
			arr[k] = temp[i];
		}

	}

	public static void divide(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = (si + ei) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		merge(arr, si, mid, ei);

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 6, 1, 9, 25 };
		int n = arr.length;
		divide(arr, 0, n - 1);

		System.out.println(Arrays.toString(arr));
	}
}