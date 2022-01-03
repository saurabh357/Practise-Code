//import java.util.Arrays;
package HackerRank;
import java.util.*;
public class rev_string {
	public static <list> void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		ArrayList<Integer> list = new ArrayList<>();
		Map<String, list> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], list.add(i));
			}
		}
		System.out.println(map);

//		for (int user : listOfUsers) {
//		    usersByCountry.computeIfAbsent(user.getCountry(), k -> new ArrayList<>()).add(user);
//		}
		
	}
}