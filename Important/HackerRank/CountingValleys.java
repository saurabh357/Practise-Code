package HackerRank;

import java.util.Arrays;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		int count = 0;
		int ans = 0;
		char[] arr = path.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'U') {
				count++;
				if (count == 0) {
					ans++;
				}
			} else {
				count--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int steps = 8;
		String path = "UDDDUDUU";
		System.out.println(countingValleys(steps, path));

	}

}
