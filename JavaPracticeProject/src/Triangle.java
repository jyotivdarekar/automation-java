
public class Triangle extends Shape {

	private double base;
	private double height;
	private double side1;
	private double side2;

	public Triangle(double base, double height, double side1, double side2) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is triangle");

	}

	double calculateArea() {
		// TODO Auto-generated method stub
		double area = 0.5 * base * height;

		System.out.println("Area of Triangle = " + area);
		return area;
	}

	double calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = base + side1 + side2;
		System.out.println("Perimeter of Triangle = " + perimeter);
		return perimeter;
	}

	

}
