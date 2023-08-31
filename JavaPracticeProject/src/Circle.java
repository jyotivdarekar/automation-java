

public class Circle extends Shape {
	
	private double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle");
		
	}

	double calculateArea() {
		// TODO Auto-generated method stub
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle = "+area);
		return area;
	}

	double calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*3.14*radius;
		System.out.println("Perimeter of Circle = " +perimeter);
		
		return perimeter;
	}

}
