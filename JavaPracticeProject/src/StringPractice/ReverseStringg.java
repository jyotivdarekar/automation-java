package StringPractice;

public class ReverseStringg {
	// printing the string by storing the reverse string into another string

	public static void main(String[] args) {
		reverseString();
	}

	public static void reverseString() {
		String str = "abcd";
		String r = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// System.out.println(str.charAt(i));
			r = r + str.charAt(i);
		}
		System.out.println(r);

	}

}
