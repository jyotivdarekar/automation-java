
public class FactorialProgram {
	/*
	 * Step 1 = Start; Step 2 = Take a n number from user Step 3 = initialize i = n;
	 * Step 4 = result = result * i; Step 5 = decrement i by one until i>=1; step 6
	 * = display result Step 7 = Stop
	 */

	public static void main(String args[]) {
		FactorialProgram fact = new FactorialProgram();
		fact.calculateFactorial(1, 1, 5);

	}

	public void calculateFactorial(int i, int fact, int num) {

		
		for (i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of " + num + " is: " + fact);


	}

}
