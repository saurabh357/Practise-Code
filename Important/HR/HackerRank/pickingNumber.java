import java.util.*;

public class pickingNumber {

	public static int pickingNumbers(List<Integer> a) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (Math.abs(a.get(i) - a.get(j)) <= 1) {
					count++;
				}
			}
			if (count > max)
				max = count;
			count = 0;
		}

		return max + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 4, 4, 5, 5, 5 };
		// int[] arr = { 4,6,5,3,3,1 };
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			a.add(arr[i]);
		}
		System.out.println(pickingNumbers(a));
	}

}
