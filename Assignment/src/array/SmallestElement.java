package array;

public class SmallestElement {
	
	public static void main(String[] args) {
		int[] arr = new int[] {8,25,97,2,33,12,56};
		
		//taking one variable to store smallest element
		int smallest = arr[0];
		
		//loop to find smallest element
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest number from array is : "+smallest);
		
	}

}
