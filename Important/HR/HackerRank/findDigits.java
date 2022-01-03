import java.util.*;

public class findDigits {

	public static int findDigits(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		int temp = n;
		while (temp > 0) {
			int rem = temp % 10;
			list.add(rem);
			temp = temp / 10;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
			}
			if (n % list.get(i) == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		findDigits dig = new findDigits();
		System.out.println(dig.findDigits(123456789));
		System.out.println(dig.findDigits(114108089));
		System.out.println(dig.findDigits(110110015));
		System.out.println(dig.findDigits(121));
		System.out.println(dig.findDigits(33));
		System.out.println(dig.findDigits(44));
		System.out.println(dig.findDigits(55));
		System.out.println(dig.findDigits(66));
		System.out.println(dig.findDigits(77));
		System.out.println(dig.findDigits(88));
		System.out.println(dig.findDigits(106108048));
		
	}
}
