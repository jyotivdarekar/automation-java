
public class ArithmeticOperations {
	
	public static void main(String[] args) {
		ArithmeticOperations obj = new ArithmeticOperations();
		obj.calculater(20, 10, '*');
		
	}
		
		
		
		
		public void calculater(int num1, int num2, char operator) {
			int result;
		
		switch (operator)
		{

		case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	     
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
		
		
		
	}

}
