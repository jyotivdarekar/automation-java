package array;

public class AscendingArrayUsingLoop {
	
	public static void main(String[] args) {
		int arr[] = new int[] {2,4,8,7,1,12,3};
		int temp = 0;
		
		//loop to print array
		System.out.println("Elements of array are:");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
		
		//for loop to sort elemenys in Ascending order
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("Elements After sorting in Ascending order :");
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
	}

}
