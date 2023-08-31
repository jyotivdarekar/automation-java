package array;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArrayUsingSortMethod {
	public static void main(String[] args) {
		
		Integer arr[] = {25, 4, 67, 19, 47, 3 };
		
		//printing original array using toString
		System.out.printf("Original Array: %s", Arrays.toString(arr));
		
		//Sorting array in descending order by using collection's method
		Arrays.sort(arr, Collections.reverseOrder());
		
		//print sorted array
		System.out.printf("\n\nSorted Array in Descending Order: %s", Arrays.toString(arr));
		
		
		
		
	}

}
