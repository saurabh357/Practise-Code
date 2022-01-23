package Arrays;

import java.util.*;

public class PlusOne {

	public static void plus(int[] arr, int n) {

		int c = 1;
		int sum=0;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] >= 9) {
				arr[i] = 0;
				sum = sum+arr[i];
			} else {
				arr[i]++;
				break;
			}
		}
//		if(sum==0) {
//			int[] temp = new int[arr.length+1];
//			temp[]
//			for(int i=0)
//			
//		}
		
//		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		int[] arr = { 9,9,9 };
		int n = arr.length;
		plus(arr, n);
	}
}
