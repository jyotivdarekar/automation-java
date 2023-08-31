package other;

public class NumberSwapping {
	
public static void main(String[] args) {
		
		NumberSwapping obj = new NumberSwapping();
		
		obj.swapNumbers(5, 2, 0);
		
		
		
		
	}
	public void swapNumbers(int a, int b, int temp){
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	}


}
