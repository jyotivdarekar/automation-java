
public class User {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	User() {
		System.out.println("Constructor1 Called");
	}

	User(String name, String last) {
		firstName = name;

		lastName = last;
	}
	
	static void add(int a, int b,int c) {
	}
	static void add(int a, int b) {}

	
}
