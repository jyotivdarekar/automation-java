
public class CountString {
	
	
	    public static void main(String[] args){
	        //countCharacter("Hello /---909 .... World");
	        countDuplicates("Hello World");
	        //removeRejex("Hello /---909 .... World");
	        //usingCharArray("Hello /---909 .... World");
	    }
	    public static void countCharacter(String s){
	        int counter = 0;
	        String finalString = s.replaceAll("[0-9]"," ");
	        System.out.println(finalString + "_final");
	        for(int i = 0; i < finalString.length(); i++){
	            if(finalString.charAt(i) != ' '){
	                counter++;
	            }
	        }
	        System.out.println(counter + "final count");
	    }

	    public static void countDuplicates(String s){
	       
	        for(int i = 0; i < s.length(); i++){
	            char ch = s.charAt(i);
	            
	            int counter = 1;
	            for(int j=0; j<s.length(); j++){
	                if(i !=j && s.charAt(i) == s.charAt(j)) {
	                    counter++;
	                }
	            }
	            System.out.println(ch + " - " + counter);
	        }
	    }

	    public static void removeRejex(String s){
	        System.out.println(s.replaceAll("[0-9]"," ") + "_replaced characters");
	    }

	    public static void usingCharArray(String s){
	        int counter = 0;
	        char chArray[] = s.toCharArray();
	        for(int i=0; i<chArray.length; i++){
	            for(int j=1; j<chArray.length; j++){
	                if(chArray[i] == chArray[j]){
	                    counter++;
	                }
	            }
	            System.out.println(counter + chArray[i]);
	        }
	    }
	}



