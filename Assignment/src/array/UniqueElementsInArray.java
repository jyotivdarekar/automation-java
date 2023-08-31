package array;

public class UniqueElementsInArray {

  public static void main(String[] args) {
	  
	  int []arr = new int[] {1,2,4,8,1,3,4,7,8,9,6};
	  
	  //loops to print an array
	  System.out.println("Elements of array");
	  for(int i = 0; i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	  System.out.println("Unique elements from array are");
	  
	  for(int i = 0; i<arr.length; i++) {
		  int count = 0;
		  for(int j = 0;j<arr.length;j++) {
			  if(arr[j] == arr[i]) {
				  count++; 
			  }
		  }
		  
		 
		  if(count == 1) {
			  System.out.print(arr[i]+" ");
		  }
	  }
	
}


}
