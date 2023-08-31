import java.util.*;

public class DivisibleByFive {
	/*
	 * Step 1 = Start Step 2 = take n number from user; Step 3 = if n%5==0 then
	 * print n is divisible by s Step 4 = else n is not divisible by 5 Step 5 = End
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Integer Input");
		int num = sc.nextInt();
		
		DivisibleByFive devisibleByFive = new DivisibleByFive();
		devisibleByFive.divisibleByTest(num);

	}

	public void divisibleByTest(int a) {
		if (a % 5 == 0) {
			System.out.println(a + " is divisible by 5");
		} else {
			System.out.println(a + " is not divisible by 5");
		}

	}

}
