package CollectionPractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list1 = new LinkedList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		System.out.println(list1);

		List<Integer> list2 = new LinkedList<>();

		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(5);

		list2.add(3, 4);
		// System.out.println(list1.addAll(list2));

		System.out.println(list2);
		
		System.out.println(list1.contains(list2));
		System.out.println(list1.containsAll(list2));
		//list2.forEach(null);
		
		System.out.println(list2.hashCode());
		list2.iterator();

	}

}
