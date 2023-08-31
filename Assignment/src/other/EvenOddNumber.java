package other;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("It is a Even Number");
		}else {
			System.out.println("It is a Odd Number");
		}
		
	}

}
