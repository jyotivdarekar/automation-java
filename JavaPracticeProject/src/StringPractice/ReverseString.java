package StringPractice;


public class ReverseString {

	public static void main(String[] args) {
      reverseString();
	}

	public static void reverseString() {
		String str = "abcd";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
