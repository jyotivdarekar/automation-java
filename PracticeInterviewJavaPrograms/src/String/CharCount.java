package String;

public class CharCount {
	
	public static void main(String[] args) {
		int a[] = new int [26];
		String s = "aaa@bbb@ccc@d";
		
//		int v = 'a';
//		System.out.println(v
//				);
		String[] arr = s.split("@",4);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String str = "I am jivika jadhav";
		
		int result = str.length()-(str.replaceAll("i ","").length());
		System.out.println(result);
		
	}

}
