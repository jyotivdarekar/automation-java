package other;

import java.util.Scanner;

public class FibbonacciSeries {
	
	//Fibonacci series in Java. In fibonacci series, next number is the sum of previous two numbers

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int num = scanner.nextInt();
        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci Series: " + firstNum + " " + secondNum);

        for (int i = 3; i <= num; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
		
	}

}
