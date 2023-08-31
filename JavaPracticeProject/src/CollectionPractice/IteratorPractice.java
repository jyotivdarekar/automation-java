package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("pqr");
		list.add("efg");
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
