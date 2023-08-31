
public class PositiveNegativeNumber {

	/*
	 * Step 1 = Start; Step 2 = Take n number From user Step 3 = if n<0; then print
	 * n is a Positive number; Step 4 = else print n is Negative Number Step 5 =
	 * stop
	 */

	public static void main(String[] args) {
		PositiveNegativeNumber obj = new PositiveNegativeNumber();
		obj.findPositiveNegativeNumber(-5);

	}

	public void findPositiveNegativeNumber(int num) {

		

		if (num > 0) {
			System.out.println(num + "  Is Positive Number");
		} else {
			System.out.println(num + "  Is Negative Number");
		}

	}
}
