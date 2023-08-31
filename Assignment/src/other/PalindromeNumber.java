package other;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Store the original number in a separate variable
        int originalNum = num;

        // Reverse the number
        int reversedNum = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            int remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
        }

        // Check if the reversed number is equal to the original number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }

       
    

}
