package listInterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("arati");
		l.add(2);
		l.add(9.3);
		l.add("java");
		l.add("selenium");
		
		System.out.println("Original list: "+l);//[arati, 2, 9.3, java, selenium]
		
		//adding by index
		l.add(2, 6);
		System.out.println("after adding by index:"+l);//[arati, 2, 6, 9.3, java, selenium]
		
		//checks 
		System.out.println(l.contains("selenium"));//true
		System.out.println(l.contains("testNG"));//false
		
		LinkedList l1 = new LinkedList();
		l1.add("arati");
		l1.add(2);
		l1.add(6);
		
		System.out.println(l.containsAll(l1));//true
		
		//remove by passing object
		l.remove("java");
		System.out.println("after removing element :"+l);
		//remove by index
		l.remove(1);
		System.out.println("after removing element by index :"+l);
		
		//changing value of element
		l.set(0,"testNg");
		System.out.println("After setting value :"+l);//[testNg, 6, 9.3, selenium]

		
		//retrieving
		l.get(0);
		
		//by for loop
		for(int i = 0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		for(Object o : l) {
			System.out.println(o);
		}
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
