package StringPractice;

public class PalindromeString2 {
	public static void main(String[] args) {
       palindromeChecker();
	}

	public static void palindromeChecker() {

		String str = "abccba";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");

		}

	}
}
