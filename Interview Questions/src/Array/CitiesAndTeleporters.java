package Array;

public class CitiesAndTeleporters {
	public static int solve(int N, int [] A, int X, int K) {
        int count =0;
        for(int i=1;i<=A.length;i++){
            K--;
            if(K>0){
                count++;
            }
            else{
                X--;
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int[] A = {0,2,10};
		int N = A.length, K=1,X=2;
		
		System.out.println(solve(N,A,X,K));
		
	}

}
