package array;

public class DescElements {
	public static void main(String[] args) {
		int a[] = { 2, 5, 4, 1, 9 };

		int temp;

//		for(int i = 0;i < a.length;i++) {
//			for(int j = i+1;j < a.length;j++) {
//				if(a[i]<a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//					
//				}
//			}
//		}
//		for(int i = 0;i < a.length;i++) {
//			System.out.print(a[i]+" ");
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
