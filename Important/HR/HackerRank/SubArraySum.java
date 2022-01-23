import java.util.*;

public class SubArraySum {
	
	public static List<Integer> findSum(List<Integer> nums,List<List<Integer>> q){
	
		List<Integer> arr = new ArrayList<>();
		int i = 0;
		List<Integer> list = new ArrayList<>();
		int sum1 =0,sum2=0;
		while(i<q.size()) {
			int l = q.get(i).get(0);
			int r = q.get(i).get(1);
			list.add(l);list.add(r);
			i++;
		}
//		for(int j=;j<=r;j++) {
//			sum1 += nums.get(i);
//		}		
		
		
		
		
		System.out.println(list);
		return arr;
		
		
	}
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		arr.add(-5);arr.add(0);
		List<Integer> one = new ArrayList<>();
		one.add(2);one.add(2);one.add(20);
		List<Integer> two = new ArrayList<>();
		two.add(1);two.add(2);two.add(10);
		List<List<Integer>> arr1 = new ArrayList<>();
		arr1.add(one);arr1.add(two);
		
		System.out.println(findSum(arr,arr1));
	}
}
