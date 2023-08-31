 package array;

public class LargestElement {
	
	public static void main(String[] args) {
		int []arr = new int[] {12,8,9,66,58,2,88};
		
		//loop to find largest element
		int largest = arr[0];
		for(int i = 0; i<= arr.length-1; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
		}
		System.out.println("Largest element from array ="+largest);
	}

}
