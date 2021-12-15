package HackerRank;

public class KangarooNumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if (v1 <= v2) {
			return "YES";
		}
		while (x1 < x2) {
			x1 += v1;
			x2 += v2;
		}
		while (x1 > x2) {
			x1 += v1;
			x2 += v2;
		}
		if (x1 == x2) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {

		System.out.println(kangaroo(0, 2, 5, 3));

	}

}
