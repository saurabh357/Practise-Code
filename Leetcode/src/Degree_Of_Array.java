import java.util.*;
public class Degree_Of_Array {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1};
		LinkedHashMap<Integer,Integer> hs = new LinkedHashMap<Integer,Integer>();
		for(int i=1;i<arr.length;i++) {
			if(!hs.containsKey(arr[i])) {
				hs.put(arr[i],1);
			}
			else {
			hs.put(arr[i], hs.get(i)+1);	
			}
		}
System.out.println(hs);
	}

}
