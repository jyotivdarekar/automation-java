
public class InsertArrayElement {

	public static void insertElement() {
		int a[] = { 10, 20, 30, 50,60,70 };
		int b[] = new int[7];

		int k = 0;
		for (int i = 0; i < a.length; i++) {

			if (i == 3) {
				b[k] = 40;
				k++;
				
				b[k]= a[i];
				k++;
			} else {
				b[k] = a[i];

				k++;
			}

		} //
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		insertElement();
	}

}
