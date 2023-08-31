
public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * INPUT n i = 2 answer = prime WHILE i <= n / 2 rem = n % i IF rem is not equal
		 * to 0 i = i + 1 ELSE answer = not prime END WHILE LOOP OUTPUT answer
		 * 
		 * 
		 * 
		 */
		PrimeNumber obj = new PrimeNumber();
		obj.findPrimeNumber(17);

	}

	public void findPrimeNumber(int num) {
		// int num = 50, count;
		int i;
		int count;

		for (i = 1; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.print(i + ",");
			}

		}
	}

}
