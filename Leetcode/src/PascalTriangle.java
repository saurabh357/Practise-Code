
public class PascalTriangle {

	public static void main(String[] args) {
		int n = 5;
		int spaces = n;
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(" " + num);
				num = num * (i - k) / (k + 1);

			}
			spaces--;
			System.out.println();
		}
	}

}
