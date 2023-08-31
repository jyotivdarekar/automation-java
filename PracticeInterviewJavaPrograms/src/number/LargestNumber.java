package number;

public class LargestNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
//		if(a>b && a>c) {
//			System.out.println("a Is a greater number");
//		}else if(b>a && b>c){
//			System.out.println("b Is a greater number");
//		}
//		else {
//			System.out.println(" c is a greater number");
//		}
		
		int largest = a>b?a:b;
		int largest2 = c>largest?c:largest;
		
		System.out.println(largest2);
	}

}
