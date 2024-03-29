package string;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big Black nose";
		int count;
		
		//convert string into lowercase
		str = str.toLowerCase();
		
		//split into words using builtin function;
		String words[] = str.split(" ");
		
		System.out.println("Duplicate words from given string:");
		for(int i = 0; i<words.length;i++) {
			count = 1;
			for(int j =i+1; j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					//set words[j] to 0 to avoid printing visited word
					words[j]= "0";
				}
			}
			
			if(count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}
	}

}
