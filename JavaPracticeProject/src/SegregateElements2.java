
public class SegregateElements2 {
	public static void main(String[] args) {
		Segregate();
	}

	public static void Segregate() {
		int a[] = { 1, 0, 1, 0 };

		int b[] = { -1, -1, -1, -1 };
		int c[] = { -1, -1, -1, -1 };
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[k] = a[i];
				k++;
			}
		}
		
		int p=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				c[p] = a[i];
				p++;
			}
		}
		
		System.out.println("Printing b array");
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
		
		System.out.println("Printing c array");
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
	}

}
