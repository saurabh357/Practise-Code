package HackerRank;

import java.util.Arrays;
import java.util.Collections;
//import java.util.*;

public class MiniMaxSum {

	public static void main(String[] args) {

		Integer[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625};
		int n = arr.length;

		int max = Collections.max(Arrays.asList(arr)); // 9
		int min = Collections.min(Arrays.asList(arr)); // 1

		int mini = 0;
		int maximum = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != max) {
				mini += arr[i];
			}
			if (arr[i] != min) {
				maximum += arr[i];
			}
		}
		System.out.print(mini);
		System.out.println(" " + maximum);
	}
}
