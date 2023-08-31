package StringPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string value");

		String s1 = sc.nextLine();
		String rev = "";
		
		

		for (int i = s1.length()-1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
			

		}
		//System.out.println("reverse string is: " + rev);
		reverseByUsingArray();
		
	}
	
	public static void reverseByUsingArray() {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter a string value");

		String s2 = sc1.nextLine();
		String rev2 = "";
		
		char a[] = s2.toCharArray();
		
		for(int i = s2.length()-1;i>=0; i--) {
			rev2 = rev2+ a[i];
		}
		System.out.println(rev2);
	}

}
