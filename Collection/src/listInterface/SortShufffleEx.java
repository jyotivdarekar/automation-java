package listInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortShufffleEx {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
		//printing collection
		System.out.println("Elements in array list are");
		System.out.println(al);
		
		//after sorting elements 
		System.out.println("after sorting elements ");
		Collections.sort(al);	
		System.out.println(al);
		
		//sorting in reverse order
		System.out.println("after sorting by reverse order");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//shuffling
		System.out.println("after shuffling");
		Collections.shuffle(al);
		System.out.println(al);
		
		
	}

}
