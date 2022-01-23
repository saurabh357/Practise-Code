package Stack;

import java.util.*;

public class ValidParantheses {
	public static boolean balance(HashMap<Character, Character> map, String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {

			if (!map.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				int pop = stack.pop();
				if (pop != map.get(s.charAt(i))) {
					return false;
				} else {
					return true;
				}
			}
		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		String s = "[(])";
		System.out.println(balance(map, s));
	}

}
