package StringPractice;

public class PalindromeString {
	public static void main(String[] args) {
       palindromeChecker();
	}

	public static void palindromeChecker() {

		String str = "abc2cba";
		int l = 0;
		int r = str.length()-1;
		boolean flag = true;
		while(l<=r) {
			if(str.charAt(l) != str.charAt(r)) {
				flag = false;
				break;
			}
			l++;
			r--;
		}
		
		if(flag == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NO Palindrome");
		}
		
	}
}
