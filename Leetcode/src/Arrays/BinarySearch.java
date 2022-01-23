package Arrays;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int[] arr, int data) {

		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		int mid = (left + right) / 2;

		while (left <= right) {
			if (arr[mid] == data) {
				System.out.println("found it ");
				return mid;
			} else if (data > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		if (left >= right) {
			System.out.println("Not found ");
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 12, 34, 35 };
		int n = arr.length;
		System.out.println(binarySearch(arr, 0));
	}

}
