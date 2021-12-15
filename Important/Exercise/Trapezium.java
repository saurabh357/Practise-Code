
public class Trapezium {

	public static void main(String[] args) {
		/*
		 1*2*3*4*17*18*19*20
  		   5*6*7*14*15*16
    		8*9*12*13
      		 10*11
		 */
		int count=0;
		int n =4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				count++;
				System.out.print(count+"*");
			}
			System.out.println();
		}

	}

}
