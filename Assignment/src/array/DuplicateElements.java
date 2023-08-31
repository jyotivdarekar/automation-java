package array;

public class DuplicateElements {
	
	public static void main(String[] args) {
		int arr[] = {2,5,8,2,4,5};
		
		System.out.print("Duplicate elements are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+",");
					
				}
			}
		}
	}
	

}
