import java.util.*;

public class Find_Intersection {

	public static void main(String[] args) {
		int[] first = new int[4];
		int[] second = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of first array : ");
		for (int i = 0; i < first.length; i++) {
			first[i] = sc.nextInt();
		}
		System.out.println("enter the elements of first array : ");
		for (int i = 0; i < second.length; i++) {
			second[i] = sc.nextInt();
		}
		int inter = 0;
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					inter = first[i];
				}
			}
		}
		System.out.println(inter);
	}
}
