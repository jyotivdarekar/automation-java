import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		  int num1 = 3; int num2 = 7; int gcd = 0;
		  
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter num1");
	      num1 = sc.nextInt();
	      System.out.println("Enter num2");
	      num2 = sc.nextInt();
		  
		  
		 

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}

		}
		System.out.println("GCD = " + gcd);
	}

}
