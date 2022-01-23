package Array;
import java.util.*;
import java.util.Map.Entry;
public class UniqueNumber {
	public static int unique(int[] arr, int n,int k) {
		int temp = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>(); 
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue() < k ) {
				temp = m.getKey();
				break;
			}
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 10, 2};
		int k =4;
		int n = arr.length;
	
		System.out.println(unique(arr,n,k));
	}

}
