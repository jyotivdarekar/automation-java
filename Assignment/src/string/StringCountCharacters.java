package string;

public class StringCountCharacters {
	public static void main(String[] args) {
		String str = "Java Automation Testing";
		int count = 0;
		
		//counts each character from string
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		//display number of characyers available in given string
		System.out.println("total number of characters in a string: " + count);
	}

}
