
public class FibonacciRecursion {
	public static void fib(int a, int b, int n) {
		if (n == 0 || n == 1) {
			return;
		}
		int c = a + b;
		a = b;
		b = c;
		System.out.println(c);
		fib(a, b, n - 1);
	}
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int n = 9;
		fib(a, b, n);
	}
}
