package listInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {
	
	public static void main(String[] args) {
		 String arr[] = {"asim","koma","mona","geeta","shyam","ram"};
		 
		 for(String value:arr) {
			 System.out.println(value);
		 }
		 
		 ArrayList al = new ArrayList(Arrays.asList(arr));
		 System.out.println(al);
		 
		 
	}

}
