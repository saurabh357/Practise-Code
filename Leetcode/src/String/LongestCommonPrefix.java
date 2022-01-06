package String;

public class LongestCommonPrefix {

	public static String longest(String[] arr, int n) {

		String temp = arr[0];

		for (int i = 1; i < n; i++) {
			while (arr[i].indexOf(temp) != 0) {
				temp = temp.substring(0, arr.length - 1); 
				if (temp.isEmpty()) {
					return "";
				}
			} 
		}

		return temp;

	}

	public static void main(String[] args) {
		String[] arr = { "flower", "flow", "flight" };
		int n = arr.length;
		System.out.println(longest(arr, n));
	}

}
