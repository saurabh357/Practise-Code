// Write a program to find all prime numbers between 99 & 499.


public class Prime_num {
	public static void main(String[] args) {
		int start = 99, end = 499;
		while (start < end) {
			boolean flag = false;
			for (int i = 2; i <= start / 2; ++i) {
				if (start % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && start != 0 && start != 1)
				System.out.print(start + " ");
			++start;
		}
	}

}