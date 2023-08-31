package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsFromString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		//Converting a string into array of a string
		String[] arr = str.split(" ");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i = 0 ;i<arr.length;i++) {
			int count = 1;
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],count );
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		System.out.println("count of words in a string");
		
		for(String s : map.keySet()) {
			
			System.out.println(s+" = "+map.get(s));
		}
	}

}
