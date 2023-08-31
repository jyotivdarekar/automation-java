
public class AdditionProgram {

	public static void main(String[] args) {
		AdditionProgram obj = new AdditionProgram();

		obj.performAddition(12, 8);

	}

	public void performAddition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition = " + sum);
	}

}
