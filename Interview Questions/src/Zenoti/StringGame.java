package Zenoti;

public class StringGame {
	public static String game(String n, int k) {
		String temp1 = "";
		String temp2 = "";
		for (int i = n.length() - 1; i >= k; i--) {
			temp1 += n.charAt(i);
		}
		for (int i = k; i < n.length(); i++) {
			temp2 += n.charAt(i);
		}

		return temp1;

	}

	public static void main(String[] args) {

		String n = "857";
		int k = 1;
		System.out.println(game(n, k));

	}
}
