
import java.math.BigInteger;

public class extraLongFactorials {

	public static void extraLongFactorials(int n) {
		BigInteger b = BigInteger.valueOf(n);
		n = n - 1;
		while (n > 0) {
			b = b.multiply(BigInteger.valueOf(n));
			n = n - 1;
		}
		System.out.println(b);
	}

	public static void main(String[] args) {

		extraLongFactorials(30);
	}
}
