package Questions;

public class Kadanes_Algo {
	public static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int max = 0;
		for (int i = 1; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 0) {
				sum = 0;
			}
			if (max < sum) {
				max = sum;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(arr));
	}

}
