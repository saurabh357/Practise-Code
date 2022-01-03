import java.util.*;

public class maxElement {
	/*
	 * public static int sum(List<Integer> li) { int sum = 0; for (int i = 0; i <
	 * li.size(); i++) { sum += li.get(i); } return sum; }
	 */

	public static int maxElement(int n, int maxSum, int k) {

int count = 0;		
		int ans = n * maxSum;
		for(int i=2;i<10;i++) {
			if(ans % i  == 0 ){
				count = i;
				break;
			}
		}
		
		
		return count;

	}

	public static void main(String[] args) {
		int n = 3, maxSum = 6, k = 1;
		System.out.println(maxElement(n, maxSum, k));

	}
}
