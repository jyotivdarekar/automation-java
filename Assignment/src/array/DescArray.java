package array;

import java.util.Scanner;

public class DescArray {
	public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the size of elements");
             int size = sc.nextInt();
             
             int arr[] = new int[size];
             System.out.println("Enter the Elements");
             for(int i = 0; i<size; i++) {
            	 System.out.print("Element " + (i + 1) + ": ");
            	 arr[i] = sc.nextInt();
            	 
             }
             
             for(int i = 0;i<size;i++) {
            	 for(int j=i+1;j<size;j++) {
            		
            			 if(arr[j] > arr[i]) {
            				 int temp = arr[i];
            				 arr[i] = arr[j];
            				 arr[j] = temp;            			 }
            		 }
            	 }
             System.out.println("Descending array :");
             for (int i = 0; i < arr.length; i++) {
     			System.out.print(arr[i] + " , ");
            
     		}
	
             
             
//             
//             System.out.println("print array elements");
//             for(Integer array : arr) {
//            	 System.out.println(array);
//             }
//             
            sc.close();
	
	}
}
