
import java.util.*;

public class Prime_num {
	public static int search(int[] arr,int left,int right,int val) {
		if(left>right) {
			return -1;
		}
		int mid = (left+right)/2;
		if(val==arr[mid]) {
			return mid;
		}
		if(val>arr[mid]) {
			return search(arr,mid+1,right,val);
		}
		return search(arr,left,mid-1,val);
		
	}
	public static void main(String[] args) {

		int[] arr = {-4,-1,3,7,21,11};
		 int val = 21;
		 int left = 0,right = arr.length-1;
		 
		 System.out.println(search(arr,left,right,val));
		
		 
	}
}