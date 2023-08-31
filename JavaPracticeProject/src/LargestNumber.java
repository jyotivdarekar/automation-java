
public class LargestNumber {
	
	/*
	 * Step 1 = start
	 * Step 2 = take three numbers a,b,c
	 * Step 3 = if a>b & a>c then print a is greater 
	 * Step 4 = else if b>a & b>c then print b is greater
	 * Step 5 = else print c is greater
	 * Step 6 = Stop
	 */

	
	public static void main(String[] args) {
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.largeNumber(12, 5, 64);
	}
		
		
		
		public void largeNumber(int num1, int num2, int num3) {
			if (num1 > num2 && num1 > num3){System.out.println(num1+" is a greater number ");
			}else if(num2 > num1 && num2 > num3) {
				System.out.println(num2+" is Largest number");
			}else 
			{System.out.println(num3+" is a Largest number");
			}
			
			
		
		
	}
}
