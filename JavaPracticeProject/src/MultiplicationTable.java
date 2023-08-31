
public class MultiplicationTable {
	public static void main(String[] args) {

		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.calculateTable(1, 5);
	}

	public void calculateTable(int i, int num) {
		for (i = 1; i <= 10; i++) {

			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
