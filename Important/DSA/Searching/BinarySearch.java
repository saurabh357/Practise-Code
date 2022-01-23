package Searching;

import java.util.Arrays;

public class BinarySearch {
	public int search(int data, int[] arr) {
		Arrays.sort(arr); // 0 1 3 4 5 10 25
							// left = 4 right = 7 mid = 3
		int left = 0, right = arr.length - 1;
		int mid = (left + right) / 2;

		while (left <= right) {
			if (data == arr[mid]) {
				System.out.println("Found it ");
				return mid;
			} else if (data > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 3, 10, 0, 25 };
		BinarySearch search = new BinarySearch();
		System.out.println(search.search(5, arr));
	}
}
