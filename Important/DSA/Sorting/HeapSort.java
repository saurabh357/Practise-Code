package Sorting;

public class HeapSort {
	public static void heapSort(int[] arr, int n) {
		int index = 0;
		int root = arr[index];
		int left = arr[2 * (index + 1)];
		int right = arr[2 * (index + 2)];

		System.out.println(root);
		System.out.println(left);
		System.out.println(right);
		
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };

		int n = arr.length;
		heapSort(arr, n);
	}
}
