
public class ArrayPractice {

	public static void main(String[] args) {
		int[] num = new int[10];

		num[0] = 10;
		num[1] = -5;
		num[2] = 30;
		num[3] = 50;
		num[4] = -25;
		num[5] = 86;
		num[6] = -32;
		num[7] = 44;
		num[8] = 23;
		num[9] = -29;

		double sum = 0;
		double average;

		for (int i = 0; i < 10; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum = " + sum);
		average = sum / num.length;

		System.out.println("Average of 10 numbers = " + average);

	}

}
