import java.util.*;
public class Kdiff_Pairs {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5 };
		int k = 1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length-1;j++) {
			if ((arr[i] - arr[j] == k) || (arr[i] - arr[j] == -k)) {
				count++;
				System.out.println(count);
				}
			}
		}
		System.out.println(count);
	}

}
