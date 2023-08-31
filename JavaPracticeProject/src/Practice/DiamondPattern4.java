package Practice;

public class DiamondPattern4 {
	
	public static void main(String[] args) {
		int i,j;
		int row = 6;
		
		for(i=0; i<row; i++){
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=row-1-i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
