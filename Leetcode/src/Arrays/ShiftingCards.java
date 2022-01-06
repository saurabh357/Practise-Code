package Arrays;

public class ShiftingCards {

	public static int ans(String[] arr, int n, int a, String c) {
		int count = 0;
		for (int i = a; i < n; i++) {
			if (!c.equals(arr[i])) {
				count++;
			}		
		}

		return count;

	}

	public static void main(String[] args) {

		String[] arr = { "black", "grey", "brown", "red", "pink" };
		int n = arr.length;
		int a = 3;
		String c = "black";
		System.out.println(ans(arr, n, a, c));
	}
}
