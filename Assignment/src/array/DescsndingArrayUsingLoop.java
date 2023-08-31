package array;

public class DescsndingArrayUsingLoop {
	public static void main(String[] args) {

		int[] arr = new int[] { 25, 4, 67, 19, 47, 3 };
		int temp = 0;

		// loop to print an array
		System.out.println("Elements of array are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}

		System.out.println();
		// Loops to sort array in Descending order
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements After sorting in Descending order :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}

}
