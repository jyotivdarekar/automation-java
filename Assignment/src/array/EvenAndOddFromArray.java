package array;

public class EvenAndOddFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println("Even numbers");

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 2 == 0) {
				System.out.print( a[i] + " ");
			}
		}
		System.out.println();
		System.out.println("odd numbers");
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
