package number;

public class Poly2 extends Polymorphism {
	
	public void testA() {
		System.out.println("poly2");
	}
	
	public static void main(String[] args) {
		Polymorphism p1 = new Poly2();
		Poly2 p2 = new Poly2();
		Poly2 p3 = (Poly2) new Polymorphism();
		
		p1.testA();
		p2.testA();
	}

}
