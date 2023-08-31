
public class OddEven {
	
	
	public static void main(String[] args) {
		FindOddEvenNumber();
	}
	
	public static void FindOddEvenNumber() {
		int a[] = {10,25,11,44,60,57};
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("Even Number = "+a[i]);
			}else
				System.out.println("Odd Number = "+a[i]);
			}
		}
		
	}
	
	


