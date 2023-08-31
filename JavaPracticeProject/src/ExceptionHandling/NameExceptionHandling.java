package ExceptionHandling;

public class NameExceptionHandling {

	public static void main(String[] args) {

		searchName("Jyoti");

		// throw new NameNotFoundException("Name is not Found");
	}

	public static void searchName(String name) {
		if (!name.equals("Jyot")) {
			throw new NameNotFoundException("Name is not Found");
		}
	}

}
