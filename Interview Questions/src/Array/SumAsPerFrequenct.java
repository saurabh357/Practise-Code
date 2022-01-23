package Array;
import java.util.*;
public class SumAsPerFrequenct {
	    public static void ans(int[] arr, int l, int r){
	        int sum = 0;
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            if(map.containsKey(arr[i])){
	                map.put(arr[i],map.get(arr[i]) +1);
	            }
	            else{
	                map.put(arr[i],1);
	            }
	        }
	        List<Integer> a = new ArrayList<Integer>();
	        List<Integer> a1 = new ArrayList<Integer>();
	        for(Map.Entry<Integer,Integer> m : map.entrySet()){
	            if(m.getValue() >=l && m.getValue() <= r){
	                a.add(m.getKey());
	            }   
	        }
	        for(int i=0;i<a.size();i++){
	            for(int j=0;j<arr.length;j++){
	                if(a.get(i) == arr[j]){
	                    sum += arr[j];
	                    a1.add(sum);
	                }
	            }
	        }
	    System.out.print(a1);
	    }
	    
	    public static void main(String args[] ) throws Exception {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i] = s.nextInt();
	        }
	        int m = s.nextInt();
	        int l=0,r=0;
	        for(int i=1;i<=m;i++){
	             l = s.nextInt();
	             r = s.nextInt();
	        }
	        ans(arr,l,r);
	    }      
	}



