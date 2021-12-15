
public class IsSubsequence {

	public static void main(String[] args) {
		String s = "agb"; // agb
		String T = "ahbgdc";
		char p1 = 0;
		char p2 = 0;
		while (p1 < s.length() && p2 < T.length()) {
			if (s.charAt(p1) == T.charAt(p2)) {
				p1++;
				p2++;
			} else {
				p2++;
			}
		}
		if (p1 == s.length()) {
			System.out.println("tue");
		} else {
			System.out.println("not");
		}
	}

}
