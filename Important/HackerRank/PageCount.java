package HackerRank;

public class PageCount {

	public static int pageCount(int n, int p) {
		if (n == p || p == 1) {
			return 0;
		}
		int b;
		int f = p / 2;
		if (n % 2 == 0) {
			b = (n - p + 1) / 2;
		} else {
			b = (n - p) / 2;
		}
		int ans = Math.min(f, b);
		return ans;

	}

	public static void main(String[] args) {

		int n = 6, p = 2;
		System.out.println(pageCount(n, p));
	}

}