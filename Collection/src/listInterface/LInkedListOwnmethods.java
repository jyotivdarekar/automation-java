package listInterface;

import java.util.LinkedList;

public class LInkedListOwnmethods {
	
	public static void main(String[] args) {
		LinkedList l2 = new LinkedList();
		l2.add("arati");
		l2.add(2);
		l2.add(9.3);
		l2.add("java");
		l2.add("selenium");
		
		l2.removeFirst();
		System.out.println(l2);
		
		l2.removeLast();
		System.out.println(l2);
		
		l2.addFirst("cucumber");
		System.out.println(l2);
		l2.addLast('z');
		System.out.println(l2);
		
		//l2.getLast();
		System.out.println(l2.getLast());
		System.out.println(l2.getFirst());
	}

}
