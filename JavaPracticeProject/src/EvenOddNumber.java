import java.util.Scanner;

public class EvenOddNumber {
	/*
	 * step 1 = Start Step 2 = take n number from user step 3 = if n%2==0; then
	 * print n is a even number Step 4 = else print n is a odd number Step 5 = Stop
	 */

	public static void main(String[] args) {

		EvenOddNumber evenOddNumber = new EvenOddNumber();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Number to check");
		int num = sc.nextInt();

		evenOddNumber.hashCode();
		evenOddNumber.equals(sc);
		evenOddNumber.checkEvenOdd(num);
		

	}

	public void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "  Is A Even Number");
		} else {
			System.out.println(num + "  Is A Odd Number");
		}
	}

}
