package array;

public class UniqueElements {
	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 5, 1, 8, 7 };
		boolean flag = true;
		

		System.out.println("Unique Elements are:");
		for (int i = 0; i < a.length; i++) {
			flag = true;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						flag = false;
						break;
					}

				}

			}
			if (flag == true) {
				System.out.println(a[i]);

			}

		}
	}

}
