package Stack;

import java.util.*;

public class GetMinAtPop {
	static int size = 0;

	public static Stack<Integer> _push(int arr[], int n) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			s.push(arr[i]);
			size++;
		}
		return s;
	}

	static void _getMinAtPop(Stack<Integer> s) {
		List<Integer> l = new ArrayList<>();
		int p=0;
		for(int i=0;i<s.size();i++) {
			p = s.pop();
			for(int j=0;j<s.size();j++) {
				if(p>s.get(i))
					p = s.get(i);
			}
			l.add(p);
		}
		System.out.println(l);
		return;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(_push(arr, arr.length));
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}
		_getMinAtPop(s);
	}

}
