package HackerRank;

import java.util.Arrays;

public class ZigZagArray {

	public static void sort(int[] arr) {
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(temp));
		return;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int tem = 7;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == tem) {
				break;
			}
			System.out.print(arr[i]);
		}

	}

}
