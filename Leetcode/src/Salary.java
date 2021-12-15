//import java.util.*;
public class Salary {
	static int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 8000, 9000, 2000, 3000, 6000, 1000 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int total = min(arr) + max(arr);
		int avg = (sum - total) / (arr.length - 2);
		System.out.println(avg);
	}
}