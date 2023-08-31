package string;

public class DuplicateCharactersFromString {
	public static void main(String[] args) {
		String str = "Fusion Institute";
		int count;
		
		//conversion of string to charArray
		char string[] = str.toCharArray();
		
		System.out.println("Duplicate characters from given string: ");
		//counts each character from string
		for(int i = 0; i < string.length;i++ ) {
			count = 1;
			for(int j = i+1; j < string.length;j++ ) {
				if(string[i] == string[j] && string[i] != ' ' ) {
					count++;
					//set string[] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}
	}

}
