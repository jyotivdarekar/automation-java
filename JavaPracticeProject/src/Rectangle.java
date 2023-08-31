
public class Rectangle extends Shape {
	
	private double side1;
	private double side2;
	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Rectangle");
		
	}
	double calculateArea() {
		// TODO Auto-generated method stub
		double area = side1*side2;
		
		System.out.println("Area of Rectangle = "+area);
		return area;
	}
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*(side1+side2);
		System.out.println("Perimeter of Circle = "+perimeter);
		return perimeter;
		
	}
	
	
	
	
	

}
