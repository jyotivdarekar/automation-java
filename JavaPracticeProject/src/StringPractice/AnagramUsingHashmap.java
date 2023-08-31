package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class AnagramUsingHashmap {
	public static void main(String[] args) {
		isAnagram("race", "care");
	}
	
	 public static boolean isAnagram(String s, String t) {
	        Map<Character,Integer> s1 = new HashMap<>();
	        Map<Character,Integer> t1 = new HashMap<>();
	        if (s.length() != t.length()) {
	        	return false;
	        }else {
	        for(int i = 0;i<s.length();++i){
	            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
	            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
	        }
	        }
	        boolean result = s1.equals(t1);
	        System.out.println(result);
	        return result;
	    }
	

}
