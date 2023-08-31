package com.set;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		System.out.println(set1);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		//union
		set1.addAll(set2);
		System.out.println(set1);//[1, 2, 3, 4, 5]
		
		//intersection
		set1.retainAll(set2);
		System.out.println(set1);//[2, 3, 4]
		
		
		//diffrence
		set1.removeAll(set2);
		System.out.println(set1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
