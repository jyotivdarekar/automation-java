
public class Utility {
	public static void main(String[] args) {
		Shape shape1 = new Triangle(12.3, 6.5, 6.0, 8);
		Shape shape2 = new Circle(6.2);
		Shape shape3 = new Square(5.5);
		Shape shape4 = new Rectangle(5, 4);
		
		
		shape1.display();
		shape1.calculateArea();
		shape1.calculatePerimeter();
		
		shape2.display();
		shape2.calculateArea();
		shape2.calculatePerimeter();
		
		shape3.display();
		shape3.calculateArea();
		shape3.calculatePerimeter();
		
		shape4.display();
		shape4.calculateArea();
		shape4.calculatePerimeter();
		
	}

}
