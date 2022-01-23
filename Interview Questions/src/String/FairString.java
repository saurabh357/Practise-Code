package String;

public class FairString {
	static int solve(int N, String s, int[] C) {
		String temp = s.charAt(0) + "" + s.charAt(1);
		boolean b = true;
		for (int i = 2; i < N; i++) {
			int j = i + 1;
			if ((s.charAt(i) + "" + s.charAt(j)) == temp) {
				return 0;
			}
		}
		System.out.println(temp);
		return 1;
	}

	public static void main(String[] args) {
		int[] C = { 1, 2, 1, 3 };
		String s = "0101";
		System.out.println(solve(s.length(), s, C));
	}

}
