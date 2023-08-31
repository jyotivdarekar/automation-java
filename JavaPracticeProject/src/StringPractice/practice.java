package StringPractice;

public class practice {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("jivika");
		String s4 = new String("jivika");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		String str = "abcdefg";
		char arr[] = str.toCharArray();
		
		
		for(int i = arr.length-1;i>=0; i--) {
			
		System.out.print(arr[i]);
		}
		System.out.println();
		
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			System.out.println(rev );
		}
		
		
		
		
	}
}
