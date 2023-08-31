package other;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int n1=0;
		int n2=1;
		
		System.out.print("Fibonacci series = "+n1+" "+n2);
		
		for(int i = 3;i<=num;i++)
		{
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
