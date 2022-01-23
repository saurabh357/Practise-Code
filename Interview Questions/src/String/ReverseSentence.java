package String;

import java.util.*;

public class ReverseSentence {
	public static String reverseWhole(String s, int n) {
		String[] arr = s.split(" ");
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += stack.pop() + " ";
		}
		System.out.println(stack);

		return ans;
	}

	public static void main(String[] args) {
		String str = "My name is Saurabh";
		int n = str.length();
		System.out.println(reverseWhole(str, n));
	}

}
