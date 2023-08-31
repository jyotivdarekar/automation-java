
public class Swap {
	
	/*
	 * Step 1 = Start;
	 * Step 2 = intialize a = 1;b=2;
	 * Step 3 = take a another variable c;
	 * Step 4 = store value of a into variable c & value of b into variable a; again store value of c into a
	 *i.e c = a, a = b; b = c;
	 *Step 5 = Stop 
	 */
	
	public static void main(String[] args) {
		
		Swap obj = new Swap();
		
		obj.swapNumbers(4, 9, 3);
		
		
		
		
	}
	public void swapNumbers(int a, int b, int temp){
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	}

}
