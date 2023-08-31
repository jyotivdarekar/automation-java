package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(101, "prachi");
		m.put(102, "Srushti");
		m.put(103, "Vedant");
		m.put(104, "Arnav");
		m.put(105, "Veda");
		
		System.out.println(m.entrySet());
		
		//printing map values using enhanced for loop
		System.out.println("printing map values using enhanced for loop");
		for(Integer i : m.keySet()) {
			System.out.println("key = "+i+" value= "+m.get(i));
		}
		
		//Iterating by iterator
		System.out.println("Iterating by iterator");
		Set<Entry<Integer,String>> s = m.entrySet();
		
		Iterator<Entry<Integer,String>> itr = s.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String> e = itr.next();
			
			System.out.println("key = "+e.getKey()+" value = "+e.getValue());
			
			// System.out.println('h'+ "e"+ 'n');
		}
	}

}
