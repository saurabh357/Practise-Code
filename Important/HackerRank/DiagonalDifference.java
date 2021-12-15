package HackerRank;

public class DiagonalDifference {
	public static void main(String[] args) {
		//1 2 3
		//4 5 6
		//9 8 9  
		int left=0;
		int right=0;
		int[][] arr = {{11,2,4},{4,5,6},{10,8,-12}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					left += arr[i][j];
				}
				if(i+j==(arr.length-1)) {
					right += arr[i][j];
				}
			}
		}
		System.out.println(Math.abs(left-right));
	}
}
