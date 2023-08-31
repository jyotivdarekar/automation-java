package array;

public class EqualityArray {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		
		boolean status = true;
		
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=b[i]) {
				status=false;
			}
			
		}
		
	}else {
		status = false;
	}
		if(status == true) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}
