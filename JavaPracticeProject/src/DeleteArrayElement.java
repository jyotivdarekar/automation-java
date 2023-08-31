


public class DeleteArrayElement {
	
	
	
	public static int[] deleteElement() {
		
		int[] a = {10,30,53,80,90};
		int[] b = new int[4];
		System.out.println("Starting Array = ");
		int j = 0;
		for(int i=0;i<a.length;i++) {
			
			if(i==2) {
				
			}else {
				b[j]=a[i];
				System.out.println(b[j]);
				j++;
			}
			
		}
		
		return b;
	}
	
	static void printArray(int a[]){
		System.out.println("***************************");
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("***************************");
	}
	
	public static void main(String[] args) {
		int a[] = deleteElement();
		System.out.println("Array Output= ");
		printArray(a);
		
	}
	
}
