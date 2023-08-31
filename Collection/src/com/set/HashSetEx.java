package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(12);
		hs.add("java");
		hs.add('h');
		hs.add("cucumber");
		hs.add(2.9);
		
		System.out.println(hs);//[java, 2.9, cucumber, h, 12]
		
		System.out.println(hs.contains(2.9));//true
		
		System.out.println(hs.isEmpty());//false
		
		hs.remove(12);
		System.out.println(hs);//[java, 2.9, cucumber, h]

		
		for(Object o : hs) {
			
			System.out.println(o);
		}
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	
	
	}

}
