import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		DiamondPattern diamondPattern = new DiamondPattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
        diamondPattern.printDiamond(number);
	}

	public void printDiamond(int rows) {
		
		int k = 0;

	    for (int i = 1; i <= rows; ++i) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }

	}

}
