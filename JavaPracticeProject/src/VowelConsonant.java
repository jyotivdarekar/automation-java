
public class VowelConsonant {

	public static void main(String[] args) {

		// char ch = 'u';
		
		VowelConsonant obj = new VowelConsonant();
		obj.checkVowelOrConsonant('b');

	}

	public void checkVowelOrConsonant(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");

	}

}
