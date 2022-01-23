package TenCommonPopularQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastPosition {
	public int[] searchRange(int[] nums, int target) {
		int[] temp = new int[2];
		if (nums.length == 0) {
			temp[0] = -1;
			temp[1] = -1;
		}
		List<Integer> list = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
				j++;
			}
		}
		if (list.size() == 0) {
			temp[0] = -1;
			temp[1] = -1;
		} else {
			temp[0] = list.get(0);
			temp[1] = list.get(list.size() - 1);
		}

		System.out.println(Arrays.toString(temp));
		return temp;

	}

	public static void main(String[] args) {
		// int[] arr = { 2, 4, 5, 5, 5, 5, 5, 7, 9, 9 };
		FirstAndLastPosition f = new FirstAndLastPosition();
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int n = arr.length;
		int target = 6;
		System.out.println(f.searchRange(arr, target));
	}
}
