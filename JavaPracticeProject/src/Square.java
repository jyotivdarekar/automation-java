
public class Square extends Shape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Square");
	}

	double calculateArea() {
		// TODO Auto-generated method stub
		double area = side * side;
		System.out.println("Area of Square = " + area);
		return area;
	}

	double calculatePerimeter() {
		// TODO Auto-generated method stub
		double Perimeter = 4 * side;
		System.out.println("Perimeter of Square = " + Perimeter);
		return 0;
	}

}
