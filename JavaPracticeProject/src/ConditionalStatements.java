
public class ConditionalStatements {

	public static void main(String[] args) {

		int percentage = 49;
		// if percentage > 90 then print A grade student
		// syntax of If block
		if (percentage > 90) { // true

			System.out.println("A grade student");
		} else if(percentage < 90 && percentage > 50){
			System.out.println("B Grade Student");
		}else {System.out.println("Fail");}

	}

}
