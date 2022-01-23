package GFG;

import java.util.Arrays;

public class Case_SpecificSorting {

	public static String caseSort(String str) {
		String ans = "";
		String cap = "";
		String low = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) {
				cap += str.charAt(i);
			} else {
				low += str.charAt(i);
			}
		}
		char[] arr1 = low.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = cap.toCharArray();
		Arrays.sort(arr2);

		String c = new String(arr2);
		String l = new String(arr1);
		int j = 0, k = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 97) && (str.charAt(i) <= 122)) {
				ans += l.charAt(j++);

			} else {
				ans += c.charAt(k++);
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		System.out.println(caseSort("defRTSersUXI"));
	}

}
