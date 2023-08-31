package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {

		// List Object 'E'-type of object

		List<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new ArrayList<>();

		list2.add(4);
		list2.add(5);
		list2.add(6);

		list1.addAll(3, list2);

		System.out.println(list1 + " List1 after adding all list2 elements ");
		System.out.println(list2 + " List2 Object");

		// find sublist
		System.out.println(list1.subList(0, 4));
		
		//clears all the elements from the list
		//list2.clear();
		
		//
		System.out.println(list1.contains(list2));
		
		//compares that both the objects are equal or not
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list1.equals(list2));
		
		//returns the element at givene index position
		System.out.println(list1.get(2));
		
		// for each loop
		for (Integer value : list1) {
			System.out.print(value + ",");
		}

	}
}
