class prime4 {
	public static long prime_Sum(int n) {
		int ans = 0;
		for (int i = 2; i <= n; i++) {
			boolean a = isPrime(i);
			if (a == true) {
				ans += i;
			}
		}

		return ans;
	}

	public static boolean isPrime(int num) {
		boolean b = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				b = false;
			}
		}
		return b;
	}

	public static void main(String[] args) {

		System.out.println(prime_Sum(5));

	}
}