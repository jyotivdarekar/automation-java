package array;

public class AscArray {
	public static void main(String[] args) {
		int arr[] = {5,8,2,14};
		
		//for loop to Ascending array
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//printing Ascending array
		System.out.print("Ascending array:");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
