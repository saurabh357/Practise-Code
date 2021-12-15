import java.util.*;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		boolean b = true;
		if (str.length() < 26) {
			b = false;
		}
		// Panagram String = The quick brown fox jumps over the lazy dog
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) < 0) {
				b = false;
			}
		}
		if (b == true) {
			System.out.println("Panagram ");
		} else {
			System.out.println("Not Panagram ");
		}
	}
}