
public class StringPractice {

	
	public static void main(String[] args) {
		
		String str = "Jivika";
		String str1 = "Jadhav";
		
		
		
		//charAt-Returns the char value at the specified index.
		System.out.println(str.charAt(5));
		
		//Returns the character (Unicode code point) at the specifiedindex
		System.out.println(str.codePointAt(2));
		
		//Returns the character (Unicode code point) before the specifiedindex.
		System.out.println(str.codePointBefore(1));
		
		//Returns the number of Unicode code points in the specified textrange of this String
		System.out.println(str.codePointCount(0, 5));
		
		//Returns the length of this string.
		System.out.println(str.length());
		
		//
		//System.out.println(str.format( ));
		
		System.out.println(" "+str.concat( str1));
		System.out.println(str.toCharArray());
	}

}
