import java.util.*;

public class FormingMagicSquare {
	public static int magic(List<List<Integer>> s) {
//		 4  5  8        // 9 3+8 
//		 2  4  1 
//		 1  9  7
		int fina = 15;
		int first = 0, second = 0, third = 0;
		for (int i = 0; i < s.size(); i++) {
			for (int j = 0; j < s.size(); j++) {
				if (i == 0) {
					first += s.get(i).get(j);
				}
				if (i == 1) {
					second += s.get(i).get(j);
				}
				if (i == 2) {
					third += s.get(i).get(j);
				}
			}
		}
		int ans = 0;
		first = Math.abs(fina - first);
		second = Math.abs(fina - second);
		third = Math.abs(fina - third);
		ans = first + second + third;
		System.out.println(first + " " + second + " " + third);
		return ans;
	}

	public static void main(String[] args) {

		Integer[][] arr = { { 4, 5, 8 }, { 2, 4, 1 }, { 1, 9, 7 } };
		List<List<Integer>> s = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> each = Arrays.asList(arr[i]);
			s.add(each);
		}
		System.out.println(magic(s));
	}
}
