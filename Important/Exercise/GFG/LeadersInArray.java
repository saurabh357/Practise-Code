package GFG;

import java.util.*;

public class LeadersInArray {
	public static ArrayList<Integer> leaders(int arr[], int n) {

		ArrayList<Integer> li = new ArrayList<>();
		int max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		int sec = 0;
		for (int i = n - 1; i > index; i--) {
			if (sec < arr[i]) {
				sec = arr[i];
			}
		}
		li.add(max);
		li.add(sec);
		int third = arr[n - 1];
		if (sec != third) {
			li.add(third);
		}
		return li;

	}

	public static void main(String[] args) {

		// int[] arr = { 16, 17, 4, 3, 5, 2 };
		int[] arr = { 1, 2, 3, 4, 0 };
		int n = arr.length;
		System.out.println(leaders(arr, n));
	}
}
