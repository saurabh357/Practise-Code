package HackerRank;

import java.util.*;

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		List<Integer> temp = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) <= 35) {
				temp.add(arr.get(i));
			} else {
				int rem = 5 - arr.get(i) % 5;
				int mulOfFive = arr.get(i) + rem;
				int sub = mulOfFive - arr.get(i);
				if (sub < 3) {
					temp.add(mulOfFive);
				} else {
					temp.add(arr.get(i));
				}
			}
		}
System.out.println(temp);
	}

}
