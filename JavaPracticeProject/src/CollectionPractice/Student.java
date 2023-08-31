package CollectionPractice;

public class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, ("Jivika"));
		Student s2 = new Student(1, ("Jivika"));

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("not Equal");
		}

	}

	boolean equals(Student s2) {
		if (this.rollNo != s2.rollNo) {
			return false;
		}
		if (!this.name.equals(s2.name)) {
			return false;
		}
		return true;
	}

}
