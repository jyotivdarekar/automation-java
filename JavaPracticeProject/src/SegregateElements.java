
public class SegregateElements {
	public static void main(String[] args) {
		Segregate();
	}

	public static void Segregate() {
		int a[] = { 1, 0, 1, 0 };
		// int b[] = new int[a.length];
		int b[] = { -1, -1, -1, -1 };
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[k] = a[i];
				k++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				b[k] = a[i];
				k++;
			}
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
