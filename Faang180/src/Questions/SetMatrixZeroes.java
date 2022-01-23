package Questions;

import java.util.*;

public class SetMatrixZeroes {
	public static void setZeroes(int[][] arr) {
		Stack<Integer> li = new Stack<>();
		int target = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					li.push(j);
				}
			}
		}
		int n = li.size();
		while (!li.isEmpty()) {
			int pop = li.pop();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (i == pop || j == pop) {
						arr[i][j] = 0;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(arr.length);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
//		int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		setZeroes(arr);

	}

}
