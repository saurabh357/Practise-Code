import java.util.Arrays;

//import java.util.Arrays;

public class FindMissing {
	public static void main(String[] args) {
		int[] arr= {1,2,2,4,1};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i] == arr[j]) {
					temp = arr[j]; 
					System.out.println(temp);
				}
			}
		}
		System.out.println(temp);
	}
}
