package Searching;

// Time - O(n) Space - O(1)

public class LinearSearch {
	public int search(int data, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 3, 10, 0, 25 };
		LinearSearch search = new LinearSearch();
		System.out.println(search.search(10, arr));
	}
}
