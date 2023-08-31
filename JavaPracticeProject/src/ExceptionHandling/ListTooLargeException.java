package ExceptionHandling;

public class ListTooLargeException extends RuntimeException {
	
	public ListTooLargeException(String message) {
		super(message);
	}

}
