package Array;
import java.io.IOException;
import java.util.*;
public class ActiveTraders {
	    public static List<String> mostActive(List<String> customers) {
	    HashMap<String,Integer> map = new HashMap<>();
	    List<String> l = new ArrayList<>();
	    int sum = 0;
	    for(int i =0;i<customers.size();i++){
	        sum++;
	        if(map.containsKey(customers.get(i))){
	            map.put(customers.get(i), map.get(customers.get(i))+1);
	        }
	        else{
	            map.put(customers.get(i), 1);
	        }
	    }
	    
	    for(Map.Entry<String,Integer> m : map.entrySet()){
	        int per = (m.getValue()/sum) * 100;
	        System.out.println(per);
	        if(per>=5){
	            l.add(m.getKey());
	        }
	    }
	    System.out.print(l);
	    return l;
	    }

	
	    public static void main(String[] args) throws IOException {
	    	List<String> customer= new ArrayList<>();
	    	
	}


}
