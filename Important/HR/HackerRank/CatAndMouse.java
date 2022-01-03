
public class CatAndMouse {

	static String catAndMouse(int x, int y, int z) {

		int firstCat = 0;
		String ans = "";
		int first = Math.abs(x - z);
		int second = Math.abs(y - z);
		if (first == second) {
			ans = "MOUSE C";
		}

		else if (first > second) {
			ans = "CAT B";
		} else {
			ans = "CAT A";
		}

		return ans;
	}

	public static void main(String[] args) {
		int x = 1, y = 3, z = 2;

		System.out.println(catAndMouse(x, y, z));
	}
}
