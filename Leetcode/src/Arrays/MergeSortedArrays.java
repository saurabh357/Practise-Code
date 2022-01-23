package Arrays;

import java.util.*;

public class MergeSortedArrays {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		for (int i = m + n + 1; i >= 0; i--) {
			int a = m >= 0 ? nums1[m] : Integer.MIN_VALUE;
			int b = n >= 0 ? nums2[n] : Integer.MIN_VALUE;
			if (a > b) {
				nums1[i] = a;
				m--;
			} else {
				nums1[i] = b;
				n--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		merge(arr1, 3, arr2, 3);
	}
}
