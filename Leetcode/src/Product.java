import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 4 };
		int[] temp = new int[arr.length];
		int mul = 1;
		for (int i = 0; i < arr.length; i++) {
			mul *= arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			temp[i] = mul / arr[i];
		}
		//System.out.println(mul);
		System.out.println(Arrays.toString(temp));
	}
}
