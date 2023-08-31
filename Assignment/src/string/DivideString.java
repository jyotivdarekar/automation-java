package string;

public class DivideString {

	public static void main(String[] args) {

		String str = "abbbcaacdabccdd";
		// stores the length of the string
		int len = str.length();

		// determines the variable that devide the string into n equal parts

		int n = 3;
		int temp = 0;
		int chars = len / n;

		// stores the array of string
		String[] equalStr = new String[n];
		// chech wheather a string can be duvuded into equal parts
		if (len % n != 0) {
			System.out.println("sorry the string cannot divided into "+ n + " equal parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				// dividing into n parts using substring
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + "equal parts of given string are");
                for(int i = 0; i < equalStr.length;i++) {
                	System.out.println(equalStr[i]);
                }
		}

	}

}
