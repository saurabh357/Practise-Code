import java.util.Arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int[] arr = { -7, -3, 2, 3, 11 };
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			temp = Math.abs(arr[i]);
			arr[i] = temp * temp;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
