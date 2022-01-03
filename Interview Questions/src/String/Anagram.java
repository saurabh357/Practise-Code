package String;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String str, String str1) {

		str = str.replaceAll("\\s", "");
		str1 = str1.replaceAll("\\s", "");

		char[] arr1 = str.toCharArray();
		char[] arr2 = str1.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(anagram("keep", "peek"));

	}

}
