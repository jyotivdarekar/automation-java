import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		QuadraticEquation qe = new QuadraticEquation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");

		double a = sc.nextDouble();
		if (a == 0) {
			System.out.println("Roots are not real");
		} else {
			System.out.println("Enter the value of b");
			double b = sc.nextDouble();
			System.out.println("Enter the value of c");
			double c = sc.nextDouble();
			qe.findRoot(a, b, c);
		}
	}

	public void findRoot(double a, double b, double c) {

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = ");

		double x1;
		double x;

		double temp = (b * b) - (4 * a * c);
		System.out.println("temp = " + temp);
		double temp1 = -b + Math.pow(temp, 0.5);
		System.out.println("temp1 = " + temp1);
		double temp2 = -b - Math.pow(temp, 0.5);
		System.out.println("temp2 = " + temp2);

		double root1 = temp1 / (2 * a);
		double root2 = temp2 / (2 * a);

		System.out.println("root1 = " + root1);
		System.out.println("root1 = " + root2);

	}

}
