//package Stack;
////package HackerRank;
////import java.util.*;
//public class AppleAndOrangeProblem {
////	    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
////	        List<Integer> app = new ArrayList<>();
////	        List<Integer> o = new ArrayList<>();
////	        for(int i=0;i<apples.size();i++){
////	            app.add(apples.get(i) + a);   
////	        }
////	        for(int i=0;i<oranges.size();i++){
////	            o.add(oranges.get(i) + b);   
////	        }
////	        int apple = 0,orange=0;
////	        for(int i=0;i<app.size();i++){
////	            if(app.get(i) >= s && app.get(i) <= t){
////	                apple++;
////	            }
////	        }
////	        for(int i=0;i<o.size();i++){
////	            if(o.get(i) >= s && o.get(i) <= t){
////	                orange++;
////	            }
////	        }
////	        System.out.println(apple);
////	        System.out.print(orange);
////	    }
//	public static void main(String[] args) {
////		List<Integer> apples = new ArrayList<>();
////		List<Integer> oranges = new ArrayList<>();
////		int s=7,t=11,a=5,b=15,m=3,n=2;
////		countApplesAndOranges(s,t,a,b,apples,oranges);
//		System.out.println("Hello");
//
//	}
//
//}
package Stack;

import java.util.*;

public class AppleAndOrangeProblem {
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

