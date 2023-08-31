package listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("jivika");
		al.add(1);
		al.add('z');
		al.add(15.2);
		
		System.out.println(al);
		
		//size
		System.out.println("size of an arraylist = "+al.size());
		//System.out.println();;
		
		
		al.remove(al.get(2));
		System.out.println(al);
		
		//add by index
		al.add(2, "welcome");
		System.out.println("elements of arraylist = "+al);
		
		//retrive specific element
		al.get(3); 
		
		//change element
		al.set(1, 3);
		System.out.println("Arraylist after changing = "+al);
		
		//search-element
		
		System.out.println(al.contains("jivika"));
		System.out.println(al.contains("vedika"));
		
		//check isEmpty()
		System.out.println(al.isEmpty());
		
		//data retriving by for loop
		System.out.println("data retriving by for loop");
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//data retriving by for each loop
		System.out.println("data retriving by for each loop");
		for(Object o:al) {
			System.out.println(o);
		}
		
		//data retriving by iterator
		System.out.println("data retriving by iterator ");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
