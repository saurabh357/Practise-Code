
public class Pattern132 {
	static boolean one(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i] < arr[j] && arr[k] < arr[j] && arr[i] < arr[k]) {
						return true;
					}
				}
			}
		}
		return false;
	}	
	public static void main(String[] args) {              // 1 3 2
		int[] arr = {3,1,4,2};
		one(arr);
				  // 0 1 2 3	
	}
}
