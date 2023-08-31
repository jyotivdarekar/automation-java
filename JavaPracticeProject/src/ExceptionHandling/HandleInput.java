package ExceptionHandling;

public class HandleInput {
	
	public static void main(String[] args){
		try{
			throwException();
		}
		catch(InvalidInputException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public static void throwException() throws InvalidInputException {
		
		throw new InvalidInputException("Please check your Input");
	}

}
