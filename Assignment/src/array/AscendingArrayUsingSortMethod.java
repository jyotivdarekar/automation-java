package array;

import java.util.Arrays;

public class AscendingArrayUsingSortMethod {
	
	public static void main(String[] args) {
		int arr[] = new int[] {2,4,8,7,1,12,3};
		
		System.out.printf("Original Array: %s", Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.printf("\n\n Sorted Array : %s", Arrays.toString(arr));
		
	}

}
