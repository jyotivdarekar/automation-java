import java.util.Scanner;

public class EqualNumbers {
	public static void main(String[] args) {
		EqualNumbers equalNumbers = new EqualNumbers();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();

		equalNumbers.equality(a, b);

	}

	public void equality(int a, int b) {

		if (a == b) {
			System.out.println("a & b Are Equal Numbers");
		} else {
			System.out.println("a & b Are Not Equal Numbers");
		}
	}

}
