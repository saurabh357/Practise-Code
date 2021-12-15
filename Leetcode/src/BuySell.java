import java.util.Arrays;

public class BuySell {

	public static void main(String[] args) {
		int[] arr = { 7, 6, 4, 3, 1 };
		int min = arr[0];
		int j = 0;
		int[] maxProfit = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (min < arr[i]) {
				maxProfit[j] = arr[i] - min;
				j++;
			}
		}
		int max = 0;
		for (int i = 0; i < maxProfit.length; i++) {
			if (max < maxProfit[i])
				max = maxProfit[i];
		}
		// System.out.println(Arrays.toString(maxProfit));
		System.out.println(max);
	}

}
