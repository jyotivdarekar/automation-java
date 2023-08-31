package StringPractice;

import java.util.Arrays;

public class AnnagramString {
	public static void main(String[] args) {
		isAnagram("Listen ", "silent");
	}

	public static boolean isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			System.out.println("not an Annagram");
			return false;
		} else {
				char a1[] = str1.toLowerCase().toCharArray();
				char a2[] = str2.toLowerCase().toCharArray();
				
				Arrays.sort(a1);//sorting array in ascending order
				Arrays.sort(a2);
				
//				//
//				for(char arr : a1) {
//					System.out.println(arr);
//				}
				
			boolean result = Arrays.equals(a1, a2);
			System.out.println(result);
			return result;
			
		}

	}

}
