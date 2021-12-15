package HackerRank;

import java.util.*;

public class dayOfProgrammer {

	public static String dayOfProgrammer(int year) {
		int mainDay = 256;
		int total = 0;
		int[] arr = { 31, 30 };
		for (int i = 0; i < 8; i++) {
			if (year % 4 == 0) {
				if (i == 7) {
					total += 31;
				} else {
					int feb = 29;
					if (i == 1) {
						total += feb;
					} else {
						total += arr[i % arr.length];
					}
				}

			} else {
				if (i == 7) {
					total += 31;
				} else {
					int feb1 = 28;
					if (i == 1) {
						total += feb1;
					} else {
						total += arr[i % arr.length];
					}
				}
			}
		}
		int a = mainDay - total;
		String ans = String.valueOf(a);
		String y = String.valueOf(year);
		String answer = a + ".09." + y;
		return answer;
	}

	public static void main(String[] args) {
		int year = 2100;
		System.out.println(dayOfProgrammer(year));
	}
}
