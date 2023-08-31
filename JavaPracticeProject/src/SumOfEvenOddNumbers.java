
public class SumOfEvenOddNumbers {
	
	public static void main(String[] args) {
		SumOfEvenOddNumbers obj = new SumOfEvenOddNumbers();
		obj.sumOfEvenOdd(13, 1);
		
	}
	
	public void sumOfEvenOdd(int num, int i) {
		
		int evenSum; 
		int oddSum;
		
		
		
		for(i = 1; i <= num; i++) {
			
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
		
	}

}
