
public class Subarray_product_lessthan_K {
	static int count = 0;

	static void one(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < k) {
				count++;
			}
		}
		return;
	}

	static void two(int[] arr, int k) {
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if (j == arr.length) {
				break;
			}
			if (arr[i] * arr[j] < k) {
				count++;
			}
			j++;
		}
		return;
	}

	static void three(int[] arr, int k) {
		int j = 1;
		int m = 2;
		for (int i = 0; i < arr.length; i++) {
			if ((j == arr.length - 1) && (m == arr.length)) {
				break;
			}
			if ((arr[i] * arr[j] * arr[m]) < k) {
				count++;
			}
			j++;
			m++;
		}
		System.out.println(count);
		return;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int k = 0;
		one(arr, k);
		two(arr, k);
		three(arr, k);
	}
}
