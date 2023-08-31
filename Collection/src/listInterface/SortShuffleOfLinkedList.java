package listInterface;

import java.util.Collections;
import java.util.LinkedList;

public class SortShuffleOfLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		Collections.sort(l);
		System.out.println(l);//[a, b, c, x, y, z]
		
				

		
		Collections.sort(l,Collections.reverseOrder());//[z, y, x, c, b, a]
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);//[x, y, a, b, z, c]
		
	}

}
