import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		/*
		 * step 1: Start Step 2: take int a = 0; int b = 1; int n = 9 ; int sum; Step 3:
		 * sum = a+b; step 4: Display sum. step 5: declare a=b & b=sum; step 6: repeat
		 * step 3,4 & 5 n times. Step 7:End
		 */

		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
		fibonacciSeries.checkFibonacci(a, b , n);
		
		
		

	}

	public void checkFibonacci(int a, int b, int n) {

		
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");

			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
