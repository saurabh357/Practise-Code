//Write a program to find all prime factors of numbers between 99 & 499.

import java.util.*;

class Prime_fact {
	static void primeFact(int i) {
		int num = i;
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int j = 2; j <= num; j++) {
			while (num % j == 0) {
				set.add(j);
				num = num / j;
			}
		}
		System.out.println("Prime Factor of " + i + " is : " + set);
		return;
	}

	public static void main(String[] args) {
		// int n =315;
		int start = 99;
		int end = 499;
		for (int i = start + 1; i <= end; i++) {
			primeFact(i);
		}
	}
}