
public class StudentData {
	static String collegeName = "Parikrama";

	String name;
	int rollNo;

	public static void main(String[] args) {
		StudentData s1 = new StudentData();
		s1.name = "A";
		s1.rollNo = 10;

		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(collegeName);
		System.out.println();

		StudentData s2 = new StudentData();
		s2.name = "B";
		s2.rollNo = 20;

		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		System.out.println(collegeName);
		System.out.println();

		StudentData s3 = new StudentData();
		s3.name = "C";
		s3.rollNo = 30;

		System.out.println(s3.name);
		System.out.println(s3.rollNo);
		System.out.println(collegeName);
		System.out.println();

	}

}
